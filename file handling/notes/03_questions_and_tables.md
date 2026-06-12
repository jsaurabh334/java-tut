# Part 3: Tables, Interview Questions, and Exam Preparation

---

## 1. Differences and Comparison Tables

### Comparison: Byte Stream vs. Character Stream
| Feature | Byte Stream | Character Stream |
| :--- | :--- | :--- |
| **Data representation** | Treats data as a sequence of raw bytes (8-bit). | Treats data as a sequence of Unicode characters (16-bit). |
| **Base Classes** | `InputStream` and `OutputStream` | `Reader` and `Writer` |
| **Typical Usage** | Binary files (images, zip archives, audio, video). | Text files, documents, logs. |
| **Encoding** | No encoding conversion is done. | Automatically handles translation between byte stream and character encoding (e.g. UTF-8). |

### Comparison: Reader/Writer vs. InputStream/OutputStream
* `InputStream`/`OutputStream` are meant for processing raw binary data.
* `Reader`/`Writer` are specialized subclasses that support internationalization and localized character sets.

---

## 2. Advantages and Limitations of Java File Handling

### Advantages
1. **Data Persistence**: Saves application state and records permanently.
2. **Platform Independence**: Java's file systems work seamlessly across Windows, macOS, and Linux.
3. **Rich API Support**: Options range from simple standard I/O streams to advanced, high-performance NIO.2 channel architectures.
4. **Security & Validation**: Integrates directly with OS-level access control.

### Limitations
1. **Performance Overhead**: Frequent disk access can slow down execution if not properly buffered.
2. **File Locking**: Managing concurrent read/write operations from multiple threads/applications requires careful locking mechanisms.
3. **Complexity**: Transitioning between different stream layers (e.g. wrapping a `FileInputStream` with an `InputStreamReader` and then a `BufferedReader`) can be verbose.

---

## 3. Real-world Applications
* **Log files**: Capturing application state, warnings, and errors dynamically.
* **Configuration management**: Reading properties files (`.properties` or `.json`).
* **Databases**: Developing light-weight local data stores or managing cached objects via Serialization.
* **Reporting tools**: Writing data exports to formats like CSV or TSV.

---

## 4. Frequent Exam & Viva Questions (with Answers)

### Q1. What is Serialization in Java?
**Answer**: Serialization is the process of translating a Java object's state into a binary format (byte stream) using `ObjectOutputStream`, allowing it to be saved to a file or sent over a network. The class must implement the marker interface `java.io.Serializable`.

### Q2. What is the role of the `transient` keyword?
**Answer**: When a member variable of a class is marked as `transient`, it will not be serialized. When the object is deserialized, the transient variable receives its default value (e.g., `0` for numeric types, `null` for objects).

### Q3. Explain the difference between `File` and `RandomAccessFile`.
**Answer**: 
* `File` is used to represent file and directory paths and to manipulate metadata (checking existence, permissions, deletion).
* `RandomAccessFile` is used to read/write actual data at arbitrary offsets within the file, allowing non-sequential file manipulation.

### Q4. Why should we wrap a `FileReader` with a `BufferedReader`?
**Answer**: `FileReader` reads characters directly from the file system, causing a disk read system call for every single character. `BufferedReader` buffers the data in memory, reading it in large chunks to minimize expensive disk access operations and improve efficiency.
