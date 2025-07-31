# Mini DoorDash Backend

A Spring Boot backend application for a food delivery platform, providing RESTful APIs for restaurant management, menu items, user authentication, and order processing.

## 🚀 Features

- **Restaurant Management** - CRUD operations for restaurants
- **Menu Items** - Manage restaurant menus with categories and dietary information
- **User Authentication** - JWT-based authentication and authorization
- **Database Integration** - PostgreSQL with Supabase
- **API Documentation** - Swagger/OpenAPI documentation
- **Security** - Spring Security with CORS configuration
- **Data Initialization** - Sample data seeding for development

## 🛠️ Tech Stack

- **Framework**: Spring Boot 3.2.0
- **Language**: Java 17
- **Database**: PostgreSQL (Supabase)
- **ORM**: Spring Data JPA with Hibernate
- **Security**: Spring Security with JWT
- **Documentation**: Swagger/OpenAPI
- **Build Tool**: Maven
- **Deployment**: Railway

## 📋 Prerequisites

- Java 17 or higher
- Maven 3.6+
- PostgreSQL database (Supabase recommended)
- Git

## 🚀 Quick Start

### 1. Clone the Repository

```bash
git clone https://github.com/ZiyanLi01/doordash-backend.git
cd doordash-backend
```

### 2. Environment Setup

Copy the environment template and configure your variables:

```bash
cp env.example .env
```

Update the `.env` file with your actual values:

```env
# Supabase Database Configuration
SUPABASE_DB_PASSWORD=your_database_password
SUPABASE_ANON_KEY=your_supabase_anon_key
SUPABASE_SERVICE_KEY=your_supabase_service_key

# JWT Configuration
JWT_SECRET=your_jwt_secret_key

# Optional: Override Supabase URL if needed
# SUPABASE_URL=https://your-project.supabase.co
# SUPABASE_DB_URL=jdbc:postgresql://your-db-url:5432/postgres?sslmode=require
```

### 3. Set Environment Variables

```bash
export SUPABASE_DB_PASSWORD="your_password"
export SUPABASE_ANON_KEY="your_anon_key"
export SUPABASE_SERVICE_KEY="your_service_key"
export JWT_SECRET="your_jwt_secret"
```

### 4. Run the Application

```bash
mvn spring-boot:run
```

The application will start on `http://localhost:8080`

## 📚 API Documentation

### Base URL
```
http://localhost:8080/api
```

### Available Endpoints

#### Health Check
- `GET /health` - Application health status

#### Restaurants
- `GET /restaurants` - Get all restaurants
- `GET /restaurants/{id}` - Get restaurant by ID
- `POST /restaurants` - Create new restaurant
- `PUT /restaurants/{id}` - Update restaurant
- `DELETE /restaurants/{id}` - Delete restaurant

#### Menu Items
- `GET /menu-items` - Get all menu items
- `GET /menu-items/{id}` - Get menu item by ID
- `GET /menu-items/restaurant/{restaurantId}` - Get menu items by restaurant
- `POST /menu-items` - Create new menu item
- `PUT /menu-items/{id}` - Update menu item
- `DELETE /menu-items/{id}` - Delete menu item

#### Users
- `POST /users/register` - Register new user
- `POST /users/login` - User login
- `GET /users/profile` - Get user profile
- `PUT /users/profile` - Update user profile

### Interactive API Documentation

Access Swagger UI for interactive API documentation:
```
http://localhost:8080/api/swagger-ui.html
```

## 🗄️ Database Schema

### Restaurants
- `id` - Primary key
- `name` - Restaurant name
- `description` - Restaurant description
- `address` - Restaurant address
- `phone_number` - Contact number
- `cuisine_type` - Type of cuisine
- `rating` - Average rating
- `delivery_fee` - Delivery fee
- `minimum_order` - Minimum order amount
- `estimated_delivery_time` - Estimated delivery time
- `is_open` - Open/closed status
- `is_active` - Active/inactive status

### Menu Items
- `id` - Primary key
- `restaurant_id` - Foreign key to restaurants
- `name` - Item name
- `description` - Item description
- `price` - Item price
- `category` - Item category
- `image_url` - Item image URL
- `is_available` - Availability status
- `is_vegetarian` - Vegetarian flag
- `is_vegan` - Vegan flag
- `is_gluten_free` - Gluten-free flag
- `calories` - Calorie count
- `preparation_time` - Preparation time

### Users
- `id` - Primary key
- `username` - Username
- `email` - Email address
- `password` - Encrypted password
- `first_name` - First name
- `last_name` - Last name
- `phone_number` - Phone number
- `address` - Delivery address
- `created_at` - Account creation date
- `updated_at` - Last update date

## 🚀 Deployment

### Railway Deployment

This project is configured for Railway deployment with the following files:

- `railway.json` - Railway configuration
- `nixpacks.toml` - Build configuration
- `RAILWAY_DEPLOYMENT.md` - Detailed deployment guide

#### Steps:
1. Connect your GitHub repository to Railway
2. Set environment variables in Railway dashboard
3. Deploy - Railway will automatically build and deploy

### Environment Variables for Production

Make sure to set these environment variables in your production environment:

```env
SUPABASE_DB_PASSWORD=your_production_db_password
SUPABASE_ANON_KEY=your_production_anon_key
SUPABASE_SERVICE_KEY=your_production_service_key
JWT_SECRET=your_production_jwt_secret
```

## 🧪 Development

### Running Tests

```bash
mvn test
```

### Building for Production

```bash
mvn clean package
```

### Database Migrations

The application uses Hibernate's `ddl-auto: update` for automatic schema updates. For production, consider using proper migration tools.

## 📁 Project Structure

```
src/
├── main/
│   ├── java/com/minidoordash/
│   │   ├── MiniDoorDashApplication.java
│   │   ├── config/
│   │   │   ├── DatabaseConfig.java
│   │   │   └── SecurityConfig.java
│   │   ├── controllers/
│   │   │   ├── HealthController.java
│   │   │   ├── RestaurantController.java
│   │   │   ├── MenuItemController.java
│   │   │   └── UserController.java
│   │   ├── models/
│   │   │   ├── Restaurant.java
│   │   │   ├── MenuItem.java
│   │   │   └── User.java
│   │   ├── repositories/
│   │   │   ├── RestaurantRepository.java
│   │   │   ├── MenuItemRepository.java
│   │   │   └── UserRepository.java
│   │   └── services/
│   │       ├── DataInitializationService.java
│   │       └── UserService.java
│   └── resources/
│       ├── application.yml
│       └── application-dev.yml
```

## 🤝 Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## 📝 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 👥 Authors

- **Ziyan Li** - *Initial work* - [ZiyanLi01](https://github.com/ZiyanLi01)

## 🙏 Acknowledgments

- Spring Boot team for the excellent framework
- Supabase for the database hosting
- Railway for the deployment platform

## 📞 Support

If you have any questions or need support, please open an issue on GitHub or contact the maintainers.

---

**Happy coding! 🚀** 