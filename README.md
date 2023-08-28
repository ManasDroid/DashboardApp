# DashboardApplication
Project Name: API Documentation
Table of Contents
Introduction
API Endpoints
1. Admin Controller
1.1 Approve or Reject Mentor Requests
1.2 Add Details to Mentor Account
1.3 Mentor Details
1.4 Web App Statistics
2. Mentor Request Controller
Services
Entities
Introduction
This README provides documentation for the APIs exposed by the project. These APIs allow interaction with mentor requests, mentor accounts, and web app statistics. The project is divided into controllers, services, and entities to manage these functionalities efficiently.

API Endpoints
1. Admin Controller
The AdminController provides endpoints for administrative tasks related to mentors, mentor requests, and web app statistics.

1.1 Approve or Reject Mentor Requests
GET /api/admin/mentor-requests: Get a list of all mentor requests.
POST /api/admin/mentor-requests/{requestId}/approve: Approve a mentor request by its ID.
POST /api/admin/mentor-requests/{requestId}/reject: Reject a mentor request by its ID.
1.2 Add Details to Mentor Account
POST /api/admin/mentors: Create a new mentor account by providing mentor details in the request body.
1.3 Mentor Details
GET /api/admin/mentors: Get a list of all mentors.
GET /api/admin/mentors/{name}: Get mentor details by name.
1.4 Web App Statistics
GET /api/admin/statistics: Retrieve web app statistics.
2. Mentor Request Controller
The MentorRequestController provides endpoints to manage mentor requests.

POST /api/admin/mentor-requests/create: Create a new mentor request by providing mentor request details in the request body.
Services
MentorService
The MentorService handles operations related to mentor accounts.

getAllMentors(): Get a list of all mentors.
getMentorByName(name): Get mentor details by name.
createMentor(mentorDetails): Create a new mentor account.
MentorRequestService
The MentorRequestService manages mentor request operations.

getAllMentorRequests(): Get a list of all mentor requests.
approveMentorRequest(requestId): Approve a mentor request by its ID.
rejectMentorRequest(requestId): Reject a mentor request by its ID.
createMentorRequest(mentorRequestDetails): Create a new mentor request.
StatisticsService
The StatisticsService provides web app statistics.

getWebAppStatistics(): Retrieve web app statistics.
Entities
Mentor
The Mentor entity represents mentor account details.

id: Mentor's unique identifier.
name: Mentor's name.
age: Mentor's age.
phoneNo: Mentor's phone number.
cv: Mentor's CV.
MentorRequest
The MentorRequest entity represents mentor request details.

id: Request's unique identifier.
name: Requester's name.
job: Requester's job.
status: Request status (e.g., "Pending," "Approved," "Rejected").
Statistics
The Statistics entity holds web app statistics.

id: Statistics record's unique identifier.
totalConsultants: Total number of consultants.
totalClients: Total number of clients.
totalSessionsBooked: Total sessions booked.
