<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Stack Implementation in Java</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            line-height: 1.6;
            max-width: 800px;
            margin: auto;
            padding: 20px;
        }
        h1 {
            color: #2c3e50;
        }
        code {
            background-color: #f4f4f4;
            padding: 4px;
            border-radius: 4px;
        }
        pre {
            background: #f4f4f4;
            padding: 10px;
            border-radius: 5px;
            overflow-x: auto;
        }
    </style>
</head>
<body>

  <h1>Stack Implementation in Java</h1>
    <p>This project demonstrates a basic stack implementation using an array in Java.</p>

   <h2>Features</h2>
    <ul>
        <li>Push elements onto the stack.</li>
        <li>Pop elements from the stack.</li>
        <li>Check if the stack is full or empty.</li>
        <li>Display the contents of the stack.</li>
    </ul>

   <h2>Project Structure</h2>
    <pre>
    /Java-Stack-Implementation
    ├── src/
    │   ├── StackOfStrings.java
    ├── README.html
    ├── LICENSE
    ├── .gitignore
    </pre>

   <h2>Usage</h2>
    <p>Example usage of the stack:</p>
    <pre>
    StackOfStrings stack = new StackOfStrings(5);
    stack.push("Apple");
    stack.push("Banana");
    stack.pop();
    System.out.println(stack);
    </pre>

  <h2>Installation</h2>
    <p>Clone the repository:</p>
    <pre><code>git clone https://github.com/chisa-sifiso/Java-Stack-Implementation.git</code></pre>

   <h2>License</h2>
    <p>This project is licensed under the MIT License.</p>

</body>
</html>
