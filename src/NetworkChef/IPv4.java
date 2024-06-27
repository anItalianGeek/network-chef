package NetworkChef;

public class IPv4 {
    
    /*
     * Class attributes, obviusly the 4 bytes that compose each byte and the subnet mask.
     * The range variable just indicateds the amount of addresses left based on the subnet mask.
     *
     * Note: for this class the subnet mask is pretty useless as the counting focuses on the 4 bytes, however it helps with a few things
     * and provides additional features to the class
    */
    protected short byte1, byte2, byte3, byte4;
    protected byte netMask;
    protected long range;
    public static final long MAX_ADDRESSES = (long) Math.pow(2, 32);
    
    // constructors, you can create the ip by passing a string or the numbers for each byte
    IPv4(int b1, int b2, int b3, int b4, int netmask){
        byte1 = (short) b1;
        byte2 = (short) b2;
        byte3 = (short) b3;
        byte4 = (short) b4;
        netMask = (byte) netmask;
        range = (long) Math.pow(2, 32-netMask);
    }
    
    IPv4(String s, int netmask){
        String[] array = s.split(".");
        byte1 = (short) Integer.parseInt(array[0]);
        byte2 = (short) Integer.parseInt(array[1]);
        byte3 = (short) Integer.parseInt(array[2]);
        byte4 = (short) Integer.parseInt(array[3]);
        netMask = (byte) netmask;
        range = (long) Math.pow(2, 32-netMask);
    }
    
    /*
     * The class provides 4 main methods for manipulating the ip address
     * inc() - increment the ip's address by 1
     * add(value) - increment the ip's address not by 1 but by how much the user wants
     * dec() - decrement the ip's address by 1
     * sub(value) - decrement the ip's address by how much the user wants
     * toBits() - converts the ip from decimal to binary, useful for bitwise operations
    */
    public IPv4 add(int value){
        if (range - value < 0)
            return null;
        else
            range -= value;
        
        int[] overflows = {0,0,0};
        overflows[2] = value / 256;
        
        if (overflows[2] >= 256){
            
            int tmp = overflows[3] - 256;
            overflows[2] -= tmp;
            overflows[1] = tmp;
        
            if (overflows[1] > 256){
                tmp = overflows[1] - 256;
                overflows[1] -= tmp;
                overflows[0] = tmp;
                
            }
            
        }

        int availableByte4 = 255-byte4;
        int needed = value % 256;
        
        if (availableByte4 < needed){
            byte3++;
            byte4 = (short) (needed - availableByte4);
        } else {
            byte4 += needed;
            value -= needed;
        }
        
        if (value != 0){
            
            byte3 += overflows[2];
            value -= 256 * overflows[2];
            
            byte2 += overflows[1];
            value -= (256 * 256) * overflows[1];
            
            byte1 += overflows[0];
            value -= (256 * 256 * 256) * overflows[0];
            
        }
        
        return new IPv4(byte1, byte2, byte3, byte4, netMask);
    }
    public IPv4 sub(int value){
        if (range + value > MAX_ADDRESSES)
            return null;
        else
            range += value;
        
        int[] overflows = {0,0,0};
        overflows[2] = value / 256;
        
        if (overflows[2] >= 256){
            
            int tmp = overflows[3] - 256;
            overflows[2] -= tmp;
            overflows[1] = tmp;
        
            if (overflows[1] > 256){
                tmp = overflows[1] - 256;
                overflows[1] -= tmp;
                overflows[0] = tmp;
                
            }
            
        }
        
        int availableByte4 = byte4;
        int needed = value % 256;
        if (availableByte4 < needed){
            byte3--;
            byte4 = (short) (255-(needed - availableByte4));
        } else {
            byte4 -= needed;
            value -= needed;
        }
        
        if (value != 0){
            
            byte3 -= overflows[2];
            value -= 256 * overflows[2];
            
            byte2 -= overflows[1];
            value -= (256 * 256) * overflows[1];
            
            byte1 -= overflows[0];
            value -= (256 * 256 * 256) * overflows[0];
            
        }
        
        return new IPv4(byte1, byte2, byte3, byte4, netMask);
    }
    
    public IPv4 inc(){
        if (range - 1 < 0)
            return null;
        else
            range--;
        
        byte4++;
        
        if (byte4 == 256){
            byte4 = 0;
            byte3++;
            
            if (byte3 == 256){
                byte3 = 0;
                byte2++;
                
                if (byte2 == 256){
                    byte2 = 0;
                    byte1++;
                }
            }
        }
        return new IPv4(byte1, byte2, byte3, byte4, netMask);
    }
    
    public IPv4 dec(){
        if (range + 1 > MAX_ADDRESSES)
            return null;
        else
            range++;
        
        byte4--;
        
        if (byte4 == -1){
            byte4 = 255;
            byte3--;
            
            if (byte3 == -1){
                byte3 = 255;
                byte2--;
                
                if (byte2 == -1){
                    byte2 = 255;
                    byte1--;
                }
            }
        }
        
        return new IPv4(byte1, byte2, byte3, byte4, netMask);
    }
    
    public String toBits() {
        String bitsFormat = "";
        int values[] = {this.byte1, this.byte2, this.byte3, this.byte4};
        for (int value : values) {
            StringBuilder builder = new StringBuilder("");
            while (value >= 1){
                builder.append(value % 2);
                value /= 2;
            }
            while (builder.toString().length() != 8){
                builder.append("0");
            }
            bitsFormat += builder.reverse().toString() + ".";
        }
        return bitsFormat.substring(0, bitsFormat.length() - 1);
    }
    
    
    /*
     * Other useful methods that the class offers
    */
    @Override public IPv4 clone() throws CloneNotSupportedException { return new IPv4(this.byte1, this.byte2, this.byte3, this.byte4, this.netMask); }
    @Override public String toString() { return byte1 + "." + byte2 + '.' + byte3 + '.' + byte4; }
    public byte getNetMask() { return netMask; }
}
