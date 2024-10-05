docker compose down --remove-orphans
# docker volume rm investment-management_postgres-data
docker compose build --no-cache
docker compose up -d

echo 'Success!'