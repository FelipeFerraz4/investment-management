# Use the official Nginx image, version 1.15.0
FROM nginx:1.15.0

# Remove the default Nginx configuration file
RUN rm /etc/nginx/conf.d/default.conf

# Copy the custom Nginx configuration file from the local directory to the container
COPY nginx.conf /etc/nginx/conf.d