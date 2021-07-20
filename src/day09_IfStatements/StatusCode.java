package day09_IfStatements;
/*
HTTP is the protocol that governs communications between web-servers and web clients.
Part of the protocol includes a status code returned by the server to tell the browser the status of its most recent page request.
   Some of the codes and their meanings are listed below:
            status code:
                200, OK
                201, Created
                202, Accepted
                301, Moved Permanently
                303, See Other
                304, Not Modified
                307, Temporary Redirect
                400, Bad Request
                401, Unauthorized
                403, Forbidden
                404, Not Found
                410, Gone
                500, Internal Server Error
                503, Service Unavailable

         declare an int variable called StatusCode
         write a if statement that prints out, on a line by itself, the appropriate label from the above list based on status.
                    Example:
                        if status code = 200
                    output:
                        ok
 */
public class StatusCode {
    public static void main(String[] args) {
        int statusCode = 400;

        if(statusCode == 200){
            System.out.println("OK");
        }else if(statusCode == 201){
            System.out.println("Created");
        }else if(statusCode == 202){
            System.out.println("Accepted");
        }else if(statusCode == 301){
            System.out.println("Moved Permanently");
        }else if(statusCode == 303){
            System.out.println("See Other");
        }else if(statusCode == 304){
            System.out.println("Not Modified");
        }else if(statusCode == 307){
            System.out.println("Temporary Redirect");
        }else if(statusCode == 400){
            System.out.println("Bad Request");
        }else if(statusCode == 401){
            System.out.println("Unauthorized");
        }else if(statusCode == 403){
            System.out.println("Forbidden");
        }else if(statusCode == 404){
            System.out.println("Not Found");
        }else if(statusCode == 410){
            System.out.println("Gone");
        }else if(statusCode == 500){
            System.out.println("Internal Server Error");
        }else if(statusCode == 503){
            System.out.println("Service Unavailable");
        }
    }
}
