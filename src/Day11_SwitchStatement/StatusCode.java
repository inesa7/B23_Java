package Day11_SwitchStatement;

public class StatusCode {
    public static void main(String[] args) {
        int statusCode = 201;

        switch (statusCode) {
            case 200:
                System.out.println("OK");
                break;

                case 201:
                    System.out.println("Created");
                    break;

                case 202:
                    System.out.println("Accepted");
                    break;

            case 303:
                System.out.println("See other");
                break;

            case 304:
                System.out.println("Not modified");
                break;

            case 307:
                System.out.println("Temporary Redirect");
                break;

            default:
                System.err.println("Invalid code");
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
            }
        }
    }




