import java.util.HashSet;

public class CollectionManager {
    private final HashSet<StudyGroup> collections = new HashSet();

    public void add(StudyGroup studyGroup){
        collections.add(studyGroup);
    }
    public void clear(){
        collections.clear();
    }
}
class  StudyGroup{

}