# Part 2: Java File Handling Theory - Advanced

---

## 1. Buffered Streams
### Definition
Buffered streams enhance I/O performance by wrapping basic streams and maintaining an internal memory buffer (typically 8KB). Instead of calling the OS for every single read/write, data is read/written in chunks.

### Classes
* `BufferedReader` / `BufferedWriter` (for characters)
* `BufferedInputStream` / `BufferedOutputStream` (for bytes)

### Syntax
```java
BufferedReader reader = new BufferedReader(new FileReader("file.txt"));
String line = reader.readLine(); // Reads line by line
```

---

## 2. Data Streams
Data streams allow you to read or write primitive data types (`int`, `float`, `boolean`, etc.) directly to/from a binary stream in a platform-independent format.
* `DataInputStream` & `DataOutputStream`

```java
DataOutputStream out = new DataOutputStream(new FileOutputStream("data.bin"));
out.writeInt(42);
out.writeDouble(3.14);
```

---

## 3. Object Serialization & Deserialization
### Serialization
The process of converting the state of a Java object into a byte stream so that it can be saved to a file or transmitted over a network.
* Object must implement the `java.io.Serializable` marker interface.
* Use `ObjectOutputStream.writeObject()`.

### Deserialization
The reverse process of converting a byte stream back into an active Java object.
* Use `ObjectInputStream.readObject()`.

```java
// Serialization
ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("object.ser"));
out.writeObject(new Student("John", 101));

// Deserialization
ObjectInputStream in = new ObjectInputStream(new FileInputStream("object.ser"));
Student s = (Student) in.readObject();
```

---

## 4. RandomAccessFile
Unlike stream classes that read or write sequentially, `RandomAccessFile` allows reading from and writing to any location in a file, resembling a large array of bytes.
* It uses a **file pointer** that can be moved using `seek(long position)`.

```java
RandomAccessFile file = new RandomAccessFile("random.txt", "rw");
file.seek(100); // Move file pointer to the 100th byte
byte[] data = new byte[10];
file.read(data);
```

---

## 5. PrintWriter
`PrintWriter` is a character-representation formatter class that formats primitives and objects into text. It provides methods like `print()` and `println()`, similar to `System.out`.

```java
PrintWriter pw = new PrintWriter("print.txt");
pw.println("Format age: " + 25);
pw.close();
```

---

## 6. Java NIO (New I/O) Package
Introduced in Java 1.4 and enhanced in Java 7 (NIO.2), the NIO package utilizes non-blocking I/O, channels, and buffers to perform high-performance, asynchronous, and memory-mapped operations.

### Key Components
* **Path**: Represents the hierarchical path to a file/directory (`java.nio.file.Path`).
* **Files**: A utility class offering static methods to manipulate files/directories (`java.nio.file.Files`).
* **Channel**: A connection representing a source or destination capable of performing I/O.
* **Buffer**: A container for data that NIO channels read from or write to.

```java
Path path = Paths.get("example.txt");
List<String> lines = Files.readAllLines(path);
```

---

## 7. Exception Handling and Try-With-Resources
All file operations can throw checked exceptions (primarily `IOException` and `FileNotFoundException`). 

### Try-With-Resources
Introduced in Java 7, this resource-management statement automatically closes any resource that implements `java.lang.AutoCloseable` at the end of the block.

```java
try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
    System.out.println(br.readLine());
} catch (IOException e) {
    e.printStackTrace();
} // br is closed automatically here
```

---

## 8. Best Practices
1. **Always close streams**: Use try-with-resources to avoid resource leaks.
2. **Buffer your streams**: Avoid reading/writing byte-by-byte. Use `BufferedReader` / `BufferedWriter`.
3. **Use Path & Files (NIO.2)**: For modern, efficient file manipulations and metadata checks.
4. **Choose correct encoding**: Always specify character sets (e.g., `StandardCharsets.UTF_8`) to prevent character corruption across different platforms.
