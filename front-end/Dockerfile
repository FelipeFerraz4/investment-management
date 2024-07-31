# Use the official Node.js image based on Alpine Linux, version 20
FROM node:20-alpine

# Set the working directory to /tmp/react
WORKDIR /tmp/react

# Copy all files from the current directory to the working directory in the container
COPY . .

# Remove the node_modules directory if it exists
RUN rm -rf node_modules

# Install dependencies defined in package.json
RUN npm install

# Build the React application for production
RUN npm run build

# Create the /var/www/html directory if it doesn't exist
RUN mkdir -p /var/www/html

# Move the build output from the dist directory to /var/www/html
RUN mv dist/* /var/www/html

# Define /var/www/html as a volume to persist data and share it between containers
VOLUME /var/www/html

# Change the working directory to the root
WORKDIR /

# Remove the /tmp/react directory and its contents to clean up
RUN rm -rf /tmp/react