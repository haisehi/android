enum class RequestError(val message:String) {
    BAD_REQUEST("invalid request"),
    INTERNAL_ERROR("Internal server error"),
    SUCCESS("server processes request successfully");
    //you can define more method here
    fun wordCount() =message.trim().split("\\s+".toRegex()).size
}