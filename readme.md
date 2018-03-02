
### REST - representational state transfer 

Using _HTTP_ & _URI_

Rest is architectural style, uses HTTP (hypertext transfer protocol) and URI (Uniform Resource Identifiers).

Rest was orginally refereed to as the „HTTP Object Model” but that led to some misunderstandings (interpretations as HTTP Server).

First, HTTP:

HTTP stands for Hypertext Transfer Protocol. It’s network protocol used to deliver virtually all files and other data (resources) on the World Wide Web.

Usually http takes place through TCP/IP sockets
A browser is HTTP client, because it sends requests to the HTTP server, which then sends response back to the client.

Like most network protocols, HTTP used client - server model. Client opens a connection and sends a request to the HTTP server. 
Server returns a response message, usually containing resource that was requested. 
After delivering, server closes connection ( making HTTP stateless protocol - doesn’t store any informations about previous transactions with client).


### STATUS CODE DEFINITIONS
|Nb | Explaining |
|----| --------------|
|1xx | informational messages |
|2xx | successes |
|3xx.| redirect  client to another URL |
|4xx | errors on the client’s side |
|5xx | errors on the server’s side |

### HTTP METHODS
|Method | | 
|-----|---------|
|GET | request for a representinal of a specified source. Requests with GET should only retrieve data. | 
|POST | is used to submit an entity to the specified resource, often changing a state or side effects on the server |
|PUT | replaces all current representations of the target resource with the request body |
|HEAD | same as GET, but without the response body. |
|DELETE | delete specified resource |
|CONNECT | establishes a tunnel to the server |
|OPTIONS |  used to describe the communication options for the target resource. |
|TRACE | method performs a message loop-back test along the path to the target resource. |
|PATCH | used to apply partial modifications to a resource. |


### REST
REST - is an architectural style for providing comuunicating standards.

In the REST architectural style, the implementation of the client and the implementation of the server can be done independently without each knowing about the other.
As long as each side knows what format of messages sent to the other side, they can be kept modular and separate.
Separating the user interface from the data storage improves the flexability of the interface across platforms and improve scalability.

By using REST interface, different clients hit the same REST endpoints, perform the same actions, and receive the same responses.

Systems that followin the REST are stateless.
Statelessness is enforced through the use of resources (nouns of the web - describes any object, document).

In REST architecture, clients send requests to retrieve or modify resources, and servers send responses to these requests.

### Requests
REST requires that a client make a request to the server.
Request consists:
* HTTP method to specify kind of an operation
* HEADER which allows the client to pass information about the request - it's called accept field
* Path to the resource
* Optional body message (contains data)

#### Header
In the Header client sends the type of content that it is able to receive from the server.
Ensures that server does not send data that cannon be understood or processed by the client.

For example - text file containing HTML would be secified with the type text/html

#### Paths
Requests must contain a path to the resource that the operation should be performed.


### Responses
When server is sending a data payload to the client, the server must include a content-type in the header of the response.
Content-type header field alerts the client to the type of data it is sending in the response body.

For example:

When client is accessing a resource with id 23 in an articles resource with this GET equest:

>GET /articles/23 HTTP/1.1</br>
 Accept: text/html, application/xhtml
 
 The server response:
 >HTTP/1.1 200 (OK)</br>
 >Content-Type: text/html


Examples of requests and responses:

Create new customer by posting the data:
>POST http://someadress.com/customers </br>
 Body:</br>
 {</br>
   “customer”: {</br>
     “name” = “Carla Bruni”</br>
     “email” = "carla@bruni.com"</br>
   }</br>
 }</br>
 
 Request:
 >201 (CREATED) </br>
 Content-type: application/json

 
