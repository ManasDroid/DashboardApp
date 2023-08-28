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

## Additional Details :

### Services
#### MentorService
The MentorService handles operations related to mentor accounts.

* getAllMentors(): Get a list of all mentors. <br>
* getMentorByName(name): Get mentor details by name.<br>
* createMentor(mentorDetails): Create a new mentor account. <br>
<br> <br>
#### MentorRequestService
The MentorRequestService manages mentor request operations.

* getAllMentorRequests(): Get a list of all mentor requests. <br>

* approveMentorRequest(requestId): Approve a mentor request by its ID. <br>

* rejectMentorRequest(requestId): Reject a mentor request by its ID. <br>

* createMentorRequest(mentorRequestDetails): Create a new mentor request. <br>
<br> <br>
#### StatisticsService
The StatisticsService provides web app statistics.

* getWebAppStatistics(): Retrieve web app statistics.
<br> <br> <br>
### Entities
#### Mentor
The Mentor entity represents mentor account details.

* id: Mentor's unique identifier. <br>
* name: Mentor's name. <br>
* age: Mentor's age. <br>
* phoneNo: Mentor's phone number. <br>
* cv: Mentor's CV. <br> <br> <br>
#### MentorRequest
The MentorRequest entity represents mentor request details.

* id: Request's unique identifier. <br>
* name: Requester's name. <br>
* job: Requester's job. <br>
* status: Request status (e.g., "Pending," "Approved," "Rejected"). <br> <br> <br>

#### Statistics
The Statistics entity holds web app statistics.

* id: Statistics record's unique identifier. <br>
* totalConsultants: Total number of consultants. <br>
* totalClients: Total number of clients. <br>
* totalSessionsBooked: Total sessions booked. <br>



