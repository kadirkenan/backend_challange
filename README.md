# Spring Boot CRUD Example

Bu proje, Spring Boot kullanarak basit bir CRUD (Create, Read, Update, Delete) uygulamasını gösterir. Proje, Şirket ve Çalışanlar arasındaki ilişkiyi yönetir.

## Başlangıç


1. Proje dizinine gidin.

    ```bash
    cd challenge
    ```

2. Uygulamayı ayağa kaldırın.

    ```bash
    ./mvnw spring-boot:run
    ```

   veya

    ```bash
    mvn spring-boot:run
    ```

   Uygulama başladığında, `http://localhost:8080` adresinde çalışacaktır.

## API Endpoint'leri ve Kullanımı

### Şirketler (Companies)

#### Yeni Şirket Oluştur

- **Endpoint:** `POST /api/companies`
- **Örnek Body:**

    ```json
    {
      "name": "ABC Company",
      "employees": [
        {
          "name": "John Doe"
        },
        {
          "name": "Jane Smith"
        }
      ]
    }
    ```

#### Tüm Şirketleri Listele

- **Endpoint:** `GET /api/companies`

#### Çalışan Ekle

- **Endpoint:** `POST /api/employees`
- **Örnek Body:**

    ```json
    {
      "name": "John Doe",
      "companyId": 1
    }
    ```

### Çalışanlar (Employees)

#### Tüm Çalışanları Listele

- **Endpoint:** `GET /api/employees`

#### Çalışanı Güncelle

- **Endpoint:** `PUT /api/employees/{employeeId}`
- **Örnek Body:**

    ```json
    {
      "name": "Updated Name"
    }
    ```

#### Çalışanı Sil

- **Endpoint:** `DELETE /api/employees/{employeeId}`

## Uygulamayı Durdurma

Uygulamayı durdurmak için terminal veya komut istemcisine `Ctrl + C` tuş kombinasyonunu kullanabilirsiniz.