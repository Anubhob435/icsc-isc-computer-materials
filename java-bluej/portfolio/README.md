# 🎨 Portfolio Website - Jahanvi Lakhmani

A modern, interactive portfolio website showcasing my skills, projects, and experience as a Java developer.

## ✨ Features

### 🎯 Core Features
- **Responsive Design** - Works perfectly on all devices (desktop, tablet, mobile)
- **Light/Dark Mode** - Toggle between themes with smooth transitions
- **Smooth Animations** - Engaging scroll animations and hover effects
- **Interactive Elements** - 3D card tilts, parallax effects, and micro-interactions

### 🎨 Design Elements
- **Glassmorphism** - Modern frosted glass effect on cards
- **Gradient Animations** - Smooth color transitions throughout
- **Custom Scrollbar** - Styled scrollbar matching the theme
- **Scroll Progress Bar** - Visual indicator at the top showing scroll position
- **Cursor Trail Effect** - Colorful trail following mouse movement
- **Confetti Celebrations** - Fun animations on form submission and theme toggle

### 📱 Sections
1. **Hero/Home** - Introduction with animated profile picture
2. **About** - Personal information and background
3. **Skills** - Technical skills with interactive cards
4. **Projects** - Showcase of Java projects
5. **Contact** - Contact form and information

### 🎮 Interactive Features
- **Smooth Scroll Navigation** - Click navigation links for smooth scrolling
- **Auto-hide Navbar** - Hides when scrolling down, shows when scrolling up
- **Active Link Highlighting** - Shows current section in navigation
- **Form Validation** - Contact form with validation and success notification
- **Easter Egg** - Konami code (↑↑↓↓←→←→BA) for a surprise!
- **Staggered Animations** - Cards animate in sequence as you scroll

## 🚀 Quick Start

1. **Add Your Profile Picture**
   - Place your profile photo as `profile.jpg` in the `portfolio` folder
   - Or update line 33 in `index.html` to point to your image

2. **Customize Content**
   - Update personal information in `index.html`
   - Modify colors in `style.css` (check CSS variables at the top)
   - Add/remove projects in the Projects section

3. **View Your Portfolio**
   - Simply open `index.html` in any modern web browser
   - No server required!

## 🎨 Color Scheme

### Light Mode
- Background: White (#ffffff)
- Text: Dark (#1a1a1a)
- Accents: Pink (#ff69b4), Red (#ff1744), Blue (#2196f3)

### Dark Mode
- Background: Dark (#0a0a0a)
- Text: White (#ffffff)
- Accents: Pink, Red, Blue (same vibrant colors)

## 🛠️ Technologies Used

- **HTML5** - Semantic markup
- **CSS3** - Advanced styling with:
  - CSS Grid & Flexbox
  - CSS Variables
  - Animations & Transitions
  - Glassmorphism effects
  - Backdrop filters
- **JavaScript (Vanilla)** - No frameworks needed:
  - Intersection Observer API
  - Local Storage for theme preference
  - Dynamic DOM manipulation
  - Event handling

## 📁 File Structure

```
portfolio/
│
├── index.html          # Main HTML file
├── style.css          # All styling and animations
├── script.js          # JavaScript functionality
├── profile.jpg        # Your profile picture (add this)
└── README.md          # This file
```

## 🎯 Browser Support

- ✅ Chrome (recommended)
- ✅ Firefox
- ✅ Safari
- ✅ Edge
- ✅ Opera

## 🔧 Customization Guide

### Change Colors
Edit the CSS variables in `style.css`:
```css
:root {
    --accent-pink: #ff69b4;    /* Change to your preferred pink */
    --accent-red: #ff1744;     /* Change to your preferred red */
    --accent-blue: #2196f3;    /* Change to your preferred blue */
}
```

### Add More Projects
Copy and paste this in the Projects section of `index.html`:
```html
<div class="project-card">
    <h3>Project Name</h3>
    <p>Project description goes here.</p>
    <div class="project-tags">
        <span class="tag">Java</span>
        <span class="tag">Your Tag</span>
    </div>
</div>
```

### Modify Contact Information
Update the contact details in the Contact section of `index.html`.

## 🌟 Special Features

### Scroll Progress Bar
A colorful gradient bar at the top shows your scroll position.

### 3D Card Tilt
Hover over skill and project cards to see them tilt in 3D!

### Smooth Notifications
Form submissions show elegant slide-in notifications instead of alerts.

### Cursor Trail
A colorful trail follows your mouse for added visual interest.

### Theme Persistence
Your theme preference is saved and remembered on return visits.

## 📝 Notes

- The contact form currently shows a notification but doesn't send emails
- To make it functional, integrate with a backend service like:
  - EmailJS
  - Formspree
  - Your own server

## 👨‍💻 Made With ❤️

Built by **Jahanvi Lakhmani**  
Grade 11 Student | Java Developer  
South City International School, Kolkata

---

## 🎓 Learning Resources

This portfolio demonstrates:
- Modern CSS techniques
- JavaScript DOM manipulation
- Responsive web design
- UI/UX best practices
- Performance optimization

Feel free to use this as a learning resource or template for your own portfolio!

## 📄 License

Free to use and modify for personal and educational purposes.

---

**Enjoy your new portfolio! 🚀**
