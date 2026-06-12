# Part 1: Java File Handling Theory - Basics

---

## 1. Introduction to File Handling
### Definition
File handling in Java refers to the mechanism of reading data from and writing data to files on a persistent storage device (like a Hard Disk, SSD, etc.) using Java programs.

### Need for File Handling
By default, data stored in program variables is volatile (stored in RAM) and is lost when the program terminates. File handling allows developers to achieve **data persistence**, enabling programs to save configurations, logs, databases, user settings, or report data long after the execution ends.

---

## 2. File Streams
### Concept
Java performs all input and output operations through **Streams**. A stream is an abstraction representing a sequence of data flowing from a source to a destination.

```
[Data Source (Keyboard, File)] ----> Input Stream ----> [Java Program]
[Java Program] ----> Output Stream ----> [Data Destination (Console, File)]
```

* **Input Stream**: Used to read data from a source.
* **Output Stream**: Used to write data to a destination.

---

## 3. Byte Stream vs. Character Stream
Java classifies streams into two broad categories based on the data format:

| Feature | Byte Stream | Character Stream |
|---|---|---|
| **Data Format** | 8-bit bytes (binary data) | 16-bit Unicode characters (text data) |
| **Hierarchy Root** | `InputStream` & `OutputStream` | `Reader` & `Writer` |
| **Typical Classes** | `FileInputStream`, `FileOutputStream` | `FileReader`, `FileWriter` |
| **Best Used For** | Images, audio, PDF, compiled code | Text files, JSON, XML, CSV |

---

## 4. File Class
### Definition
The `java.io.File` class represents file and directory pathnames in an abstract manner. It is used to inspect file metadata (existence, size, permissions) rather than reading or writing the file's content.

### Syntax
```java
File file = new File("path/to/file.txt");
```

### Key Methods
* `createNewFile()`: Creates a new empty file. Returns `true` if successful.
* `exists()`: Checks if the file or directory exists.
* `getName()`: Returns the name of the file.
* `getAbsolutePath()`: Returns the absolute path.
* `length()`: Returns the size of the file in bytes.
* `delete()`: Deletes the file or directory.

---

## 5. Basic File Operations
### Creating a File
To create a file, construct a `File` object and invoke `createNewFile()`.
```java
File file = new File("example.txt");
if (file.createNewFile()) {
    System.out.println("File created: " + file.getName());
}
```

### Writing to a File
Use `FileWriter` to write characters to a file.
```java
FileWriter writer = new FileWriter("example.txt");
writer.write("Hello, Java File Handling!");
writer.close();
```

### Reading from a File
Use `FileReader` or a helper class like `Scanner` to read file content.
```java
FileReader reader = new FileReader("example.txt");
int character;
while ((character = reader.read()) != -1) {
    System.out.print((char) character);
}
reader.close();
```

### Appending Data
By default, writing to a file overwrites existing content. To append, pass `true` as the second parameter to the `FileWriter` constructor.
```java
FileWriter writer = new FileWriter("example.txt", true); // true indicates append mode
writer.write("\nThis line is appended.");
writer.close();
```

### Deleting Files
```java
File file = new File("example.txt");
if (file.delete()) {
    System.out.println("Deleted the file: " + file.getName());
}
```

### Renaming Files
```java
File oldFile = new File("old.txt");
File newFile = new File("new.txt");
oldFile.renameTo(newFile);
```

### Directory Handling
To create a directory:
```java
File dir = new File("myDirectory");
dir.mkdir(); // or dir.mkdirs() for nested directories
```

To list files inside a directory:
```java
File dir = new File(".");
String[] filesList = dir.list();
for (String fileName : filesList) {
    System.out.println(fileName);
}
```
