# Network Chef: Subnetting and Supernetting Tool

> This one started as curiosity, not homework. Written across the end of the first
> semester and the start of the second in my fourth year, right after the subnetting part
> of the networking course: I wanted to find out how much of that theory I could actually
> turn into working code, and how efficient I could make the calculation.
>
> Kept as a learning archive, without active development or maintenance.

## Overview

Network Chef is an educational Java Swing desktop application developed during the fourth year of high school to turn IPv4 networking theory into working calculation routines. The project allows users to plan contiguous subnet allocations from a starting network address and to compute supernet summaries between two IPv4 addresses.

The application covers two exercises from the networking course:
- **Subnetting (VLSM-style single-level allocation)**: Given a starting network address, a base subnet mask, and a list of required host capacities, the program sorts the subnet requests in descending order (using Quicksort), adds 2 reserved addresses (network ID and broadcast), computes the required power-of-two address blocks, and calculates each subnet's network ID, usable host range, router address, broadcast IP, and subnet mask. As noted directly in the user interface, the tool is designed for a single-level hierarchy; multi-tier sub-allocations must be computed iteratively per block.
- **Supernetting (Route summarization)**: Given two IPv4 addresses, the application converts both into 32-bit binary strings, identifies their longest contiguous common prefix starting from bit 0, pads the remaining host bits with zeros, and displays the resulting aggregated supernet address with its prefix length (`/mask`).

## Features

- **Subnet Allocation**:
  - Specify the starting network IP and base subnet mask in CIDR short form.
  - Add individual subnets by host capacity requirement.
  - Computes network ID, router IP, broadcast IP, and subnet masks.
- **Supernet Calculation**:
  - Input two IPv4 addresses to derive the common enclosing supernet prefix.
- **Swing Desktop UI**:
  - Interactive tables for input networks and calculated output ranges.
  - Table reset and input clearing utilities.

## Requirements

- **Java Development Kit (JDK)**: Version 17 or higher (configured in `nbproject/project.properties` with `javac.source=17` and `javac.target=17`).
- **Build Tool / IDE**: Apache Ant or Apache NetBeans (JDK 17 compatible, such as Apache NetBeans 17+; NetBeans 8.2 is not compatible with JDK 17 bytecode).

## Installation & Running

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/anItalianGeek/network-chef.git
   cd network-chef
   ```
   *(The default repository branch is `network-chef-v1.1`)*.

2. **Check the historical distribution**:
   `dist/NetworkChef_v1.jar` launches the older `networkchef_v1.window` entry point. It is preserved as a historical artifact; build the current sources below to use the `NetworkChef.window` entry point and the current supernetting UI.

3. **Build and Run with Apache Ant**:
   ```bash
   ant jar
   java -jar dist/NetworkChef.jar
   ```

4. **Open in NetBeans IDE**:
   - Launch Apache NetBeans (configured with a JDK 17+ Java platform).
   - Select `File > Open Project`.
   - Choose the `network-chef` folder.
   - Right-click the project and select `Run`.

## Usage

1. **Subnetting**:
   - In the **Input Area**, enter the starting network IP (e.g. `192.168.1.0`) and the base subnet mask prefix (e.g. `24`).
   - Under **Create the network**, specify the number of devices needed for a subnet in the spinner and click **Add devices**. Repeat for each required subnet.
   - Click **Cook the networks**. The results table will display the allocated subnets with their network IDs, router addresses, broadcast addresses, and subnet masks.
   - Use **Clean Table** or **Clear Network Creation Table** to reset.

2. **Supernetting**:
   - Under **SUPERNETTING**, enter the first IPv4 address into **Input First Network Address** and the second into **Input Second Network Address**.
   - Click **Cook the Network**.
   - The aggregated summary network address and prefix (e.g. `192.168.0.0/23`) will appear in the output field.

## Implementation Notes & Known Limitations

- **Educational Scope**: Built as a high school exploration of IP arithmetic and Swing GUI design. It assumes standard IPv4 dotted-decimal formatting without full RFC-level error recovery.
- **Hierarchy Scope**: Designed for single-level subnet splitting; hierarchical or multi-branch sub-allocations require running the calculation separately for each branch.
- **Large Allocation Edge Case**: The `add` and `sub` methods in `NetworkChef.IPv4` contain an out-of-range carry-array access for sufficiently large increments. Large-allocation behavior needs dedicated tests before relying on the results.
- **String Parsing**: In `NetworkChef.IPv4(String, int)`, the constructor uses `s.split(".")`, which in Java treats `.` as a regex wildcard. The GUI avoids this issue by parsing octets manually with `substring` and `indexOf`.

## Version History

- **v1.1** (Current): Added supernetting calculation (bit-level prefix extraction for two IPv4 addresses) and UI controls.
- **v1.0** (`networkchef_v1` package): Initial subnetting implementation and Swing table presentation.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Contact

For questions or feedback, contact Ognjen Vasic at ognjenvasic70@gmail.com.
