📦 File Packer Unpacker - Java Project

📝 Project Description
This Java-based desktop application performs file packing and unpacking operations.

Packing: Combines multiple files from a selected directory into a single packed file with metadata (like file names, sizes, and checksums) and encrypted content.
Unpacking: Extracts all original files from a packed file using the stored metadata and restores them with their original data.
The project uses Java for both frontend and backend, ensuring platform independence.

💻 Features
Authentication System:

Requires valid credentials to access the application.

Username: MarvellousAdmin
Password: MarvellousAdmin

Limited to 3 login attempts.
Uses a separate thread to:
Validate minimum 8-character credentials
Detect if Caps Lock is on

GUI-Based Interface:

Main window provides Pack and Unpack options.
Accepts directory and file name for packing.
Accepts packed file name for unpacking.

Packing Functionality:

Traverses the specified directory and collects files.
Creates a packed file with metadata and encrypted file data.
Generates a log file recording file names, sizes, and checksums.
Displays a packing report after completion.

Unpacking Functionality:
Reads and verifies the packed file using a magic number.
Extracts each file using stored metadata.
Recreates original files with correct data.
Displays an unpacking report.

🔐 Security
Basic encryption is used during packing.
Packed file integrity is verified during unpacking using a magic number or identifier.

📁 Example Use Cases
Backing up entire directories into a single file.
Bundling multiple project files or logs into one secure file.
Sending multiple files securely with metadata.

🚀 How to Run
Compile the code:

Log in using credentials.
Click Pack to compress a directory.
Click Unpack to extract from a packed file.

📌 Technologies Used
Java SE (Core Java)
Java AWT/Swing for GUI
File I/O and Directory traversal

