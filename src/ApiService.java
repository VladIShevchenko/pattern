public class ApiService {
    private static ApiService instance;

    private ApiService() {
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
