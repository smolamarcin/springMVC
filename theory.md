
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



REST
