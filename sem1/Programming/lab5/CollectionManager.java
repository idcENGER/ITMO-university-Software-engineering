import java.util.HashSet;

public class CollectionManager {
    private final HashSet<MusicBand> collections = new HashSet<>();
    public void add(MusicBand musicBand){
        collections.add(musicBand);
    }
    public void clear(){
        collections.clear();
    }
}
class MusicBand{}