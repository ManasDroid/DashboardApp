# DashboardApplication

A project containing a backend with APIs of the admin dashboard a Web app (that allows users to find and
book sessions with consultants).The admin dashboard is the key component of any web
app. So, that API should be very flexible to be integrated with any other component.
The admin dashboard approves the consultants account to verified status. It also keeps a
track of the no of consultants registered, no of clients registered and no of sessions booked.



## API Endpoints

### 1. Admin Controller
#### 1.1 Approve or Reject Mentor Requests.
Get all items

```http
  GET /api/admin/mentor-requests
```

| Parameter | Type | Description                |
|:----------|:-----| :------------------------- |
| `none`    | `none`  | Get a list of all mentor requests|

Approval

```http
  POST /api/admin/mentor-requests/{requestId}/approve
```

| Parameter   | Type   | Description                       |
|:------------|:-------| :-------------------------------- |
| `requestId` | `long` | Approve a mentor request by its ID |


 Rejection

```http
  POST /api/admin/mentor-requests/{requestId}/reject
```

| Parameter | Type   | Description                       |
| :-------- |:-------| :-------------------------------- |
| `requestId`      | `long` | Reject a mentor request by its ID. |

### 1.2 Add details to mentor account
 Add details

```http
  POST /api/admin/mentors
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `mentorDetails `      | `Mentor ` | Create a new mentor account by providing mentor details in the request body. |

### 1.3 Mentor Details 
Get all items

```http
  GET /api/admin/mentors
```

| Parameter | Type   | Description                       |
|:----------|:-------| :-------------------------------- |
| `none`    | `none` | Get a list of all mentors. |
Get particular mentor

```http
  GET /api/admin/mentors/{name}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `name`      | `string` | Get mentor details by name. |
### 1.4 Web App Statistics
App Stats

```http
  GET /api/admin/statistics
```

| Parameter | Type   | Description                       |
|:----------|:-------| :-------------------------------- |
| `none`    | `none` | Retrieve web app statistics. |
### 2. Mentor Request Controller
 
Add Request

```http
  POST /api/admin/mentor-requests/create
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `mentorRequestDetails `      | `MentorRequest` | Create a new mentor request by providing mentor request details in the request body. |


