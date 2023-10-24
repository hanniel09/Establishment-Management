
# Establishment-Management

Backend challenge from the company FCamara which consists of parking management along with the creation of the vehicle and joining the tables


## API Reference

### API Parking

#### Get all parkings

```SHELL
  GET /api/parking
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `-` | `-` | **Required**. Server running |

#### Get parking

```SHELL
  GET /api/parking/{id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `long` | **Required**. Id of parking to fetch |

#### Create parking

```SHELL
  POST /api/parking
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id_establishment, id_vehicle`      | `JSON` | **Required**. Parameters to create a parking |

#### Update parking

```SHELL
  PUT /api/parking/{id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id, id_establishment, id_vehicle`      | `JSON, long` | **Required**. Parameters to update a parking |

#### Delete parking

```SHELL
  DELETE /api/parking/{id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `long` | **Required**. id of parking to delete  |


### API Establishment

#### Get all establishments

```SHELL
  GET /api/establishment
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `-` | `-` | **Required**. Server running |

#### Get establishment

```SHELL
  GET /api/establishment/{id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `long` | **Required**. Id of establishment to fetch |

#### Create establishment

```SHELL
  POST /api/establishment
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `name, CNPJ, address, phone, motorcycleSpaces, carSpaces`      | `JSON` | **Required**. Parameters to create a establishment |

#### Update establishment

```SHELL
  PUT /api/establishment/{id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id, name, CNPJ, address, phone, motorcycleSpaces, carSpaces`      | `JSON, long` | **Required**. Parameters to update a establishment |

#### Delete establishment

```SHELL
  DELETE /api/establishment/{id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `long` | **Required**. id of establishment to delete  |


### API Vehicle

#### Get all vehicles

```SHELL
  GET /api/vehicle
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `-` | `-` | **Required**. Server running |

#### Get vehicle

```SHELL
  GET /api/vehicle/{id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `long` | **Required**. Id of vehicle to fetch |

#### Create vehicle

```SHELL
  POST /api/vehicle
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `brand, model, color, plate, type` | `JSON` | **Required**. Parameters to create a vehicle |

#### Update vehicle

```SHELL
  PUT /api/vehicle/{id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id, brand, model, color, plate, type`      | `JSON, long` | **Required**. Parameters to update a vehicle |


```SHELL
  DELETE /api/vehicle/{id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `long` | **Required**. id of vehicle to delete  |


## Tech Stack

**Server:** Java, Spring boot, Mysql

