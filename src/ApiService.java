public class ApiService {
    private static ApiService instance=null;
    public String s;
    private ApiService() {
        s = "Singleton class";
    }


    public static ApiService getInstance() {
        if (instance == null)
            synchronized (ApiService.class) {
                if (instance == null)
                    instance = new ApiService();
            }
        return instance;
    }
}
