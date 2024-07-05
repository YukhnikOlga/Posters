public class PosterManager {
    private String[] posters = new String[0];
    private int limit;

    public PosterManager() {
        this.limit = 5;
    }

    public PosterManager(int limit) {
        this.limit = limit;
    }

    public void addPoster(String poster) {  //  добавить фильм
        String[] tmp = new String[posters.length + 1];
        for (int i = 0; i < posters.length; i++) {
            tmp[i] = posters[i];
        }
        tmp[tmp.length - 1] = poster;
        posters = tmp;
    }

    public String[] findAllPosters() {
        return posters;
    }

    public String[] findLastPosters() {  //  показать все фильмы
        int resultLength;
        if (posters.length < limit) {
            resultLength = posters.length;
        } else {
            resultLength = limit;
        }
        String[] tmp = new String[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = posters[posters.length - 1 - i];
        }
        return tmp;
    }
}


//    public class PosterItem {
//        private int id;
//        private int posterId;
//        private String posterName;

//        public PosterItem(int id, int posterId, String posterName) {
//            this.id = id;
//            this.posterId = posterId;
//            this.posterName = posterName;



//    public void removeById(int id) {
//        PosterItem[] tmp = new PosterItem[items.length - 1];
//        int copyToIndex = 0;
//        for (PosterItem item : items) {
//            if (item.getId() != id) {
//                tmp[copyToIndex] = item;
//                copyToIndex++;
//            }
//        }
//        items = tmp;
