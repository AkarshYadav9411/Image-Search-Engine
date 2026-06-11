# 🔍 Image Search Engine

A lightweight, high-performance, and responsive web application designed to search and retrieve high-resolution images. Powered by the **Unsplash API**, this application provides a clean user interface with dynamic photo rendering and pagination features.

---

## 🚀 Features

- **Instant Search:** Fetches relevant photos in real-time based on user keywords.
- **Dynamic Grid Layout:** Modern 3-column CSS Grid displaying search results cleanly on desktops and tablets.
- **Infinite Pagination:** A "Show More" button to retrieve subsequent pages of images seamlessly.
- **Direct Source Links:** Click any image to open its official page on Unsplash in a new tab.
- **Responsive Web Design:** Fully adaptable layout for all screen dimensions (mobile, tablet, desktop).

---

## 🛠️ Tech Stack & Architecture

- **Frontend Core:** HTML5, CSS3, ES6+ JavaScript.
- **Layout Engines:** CSS Grid and Flexbox for fluid responsiveness.
- **API Integration:** Native Fetch API with `async/await` syntax.
- **Image Source:** [Unsplash API](https://unsplash.com/developers).

---

## 📂 Directory Structure

```
Image-Search-Engine/
├── index.html       # Application markup and structure
├── style.css        # Custom CSS styles, grid layouts, and color themes
├── script.js       # Search logic, API requests, and DOM rendering
└── README.md        # Documentation
```

---

## 🔌 API Configuration

The search queries are processed using the Unsplash Photos search endpoint:
```
https://api.unsplash.com/search/photos?page={page}&query={keyword}&client_id={accessKey}&per_page=12
```

### Setup Your Own Unsplash API Key:
1. Register for a developer account at [Unsplash Developers](https://unsplash.com/developers).
2. Create a new application on your Unsplash developer dashboard to obtain your **Access Key**.
3. Open `script.js` and replace the `accessKey` variable with your unique key:
   ```javascript
   const accessKey = "YOUR_UNSPLASH_ACCESS_KEY";
   ```

---

## ⚙️ How to Run Locally

### Prerequisites
You only need a modern web browser to run this application (no server-side or compile-time dependencies required).

### Step 1: Clone the Repository
```bash
git clone https://github.com/AkarshYadav9411/Image-Search-Engine.git
cd Image-Search-Engine
```

### Step 2: Launch the App
Simply open the `index.html` file in any browser, or use VS Code's **Live Server** extension.

---

## 🤝 Contributing

Contributions and feedback are welcome! Feel free to open an issue or submit a pull request if you want to enhance the design, add features, or optimize code.

---

## 📄 License
This project is open-source. Feel free to use and customize it.
