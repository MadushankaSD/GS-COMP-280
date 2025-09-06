# Use official Node.js LTS version as base image
FROM node:18-alpine

# Set working directory inside the container
WORKDIR /app

COPY . .

# Install dependencies (if you have a package.json)
RUN npm install

# Expose the port your app listens on
EXPOSE 5000

# Command to run your app
CMD ["node", "index.js"]