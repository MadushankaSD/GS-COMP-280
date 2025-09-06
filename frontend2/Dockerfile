# Use official nginx image as base
FROM nginx:alpine

# Remove default nginx static files
RUN rm -rf /usr/share/nginx/html/*

# Copy your frontend files (assuming your HTML file is named index.html)
COPY . /usr/share/nginx/html/

# Expose port 80
EXPOSE 80

# Start nginx (default command)
CMD ["nginx", "-g", "daemon off;"]