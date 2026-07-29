# DevOps Capstone

## Project Description

This project demonstrates a complete Continuous Integration and Continuous Deployment (CI/CD) pipeline for a Java Maven application using Jenkins and Docker on AWS EC2. The application source code is stored in GitHub, automatically built using Maven, containerized using Docker, and deployed on an EC2 instance. The infrastructure is monitored using Prometheus and Grafana.

---

## Tech Stack

- Java 17/21
- Maven
- Git & GitHub
- Jenkins
- Docker
- AWS EC2 (Ubuntu)
- Prometheus
- Node Exporter
- Grafana

---

## Project Structure

```
DevOps-Capstone/
│
├── src/
├── pom.xml
├── Dockerfile
├── Jenkinsfile
├── README.md
```

---

## Setup Instructions

### 1. Clone Repository

```bash
git clone https://github.com/laksavi5/DevOps-Capstone.git

cd DevOps-Capstone
```

### 2. Build Maven Project

```bash
mvn clean package
```

### 3. Build Docker Image

```bash
docker build -t devops-capstone .
```

### 4. Verify Docker Image

```bash
docker images
```

### 5. Run Docker Container

```bash
docker run -d -p 8080:8080 --name devops-container devops-capstone
```

### 6. Verify Running Container

```bash
docker ps
```

---

## CI/CD Flow

```
Developer
     │
     ▼
GitHub Repository
     │
     ▼
Jenkins Pipeline
     │
     ├── Checkout Source Code
     ├── Build Application (Maven)
     ├── Build Docker Image
     ├── List Docker Images
     └── Run Docker Container
            │
            ▼
AWS EC2 Deployment
            │
            ▼
Prometheus + Node Exporter
            │
            ▼
Grafana Dashboard
```

---

## Monitoring

The deployed EC2 instance is monitored using:

- Prometheus
- Node Exporter
- Grafana

Metrics Monitored:

- CPU Usage
- Memory Usage
- Disk Usage
- Network Traffic

---

## Author

Lakshmi
