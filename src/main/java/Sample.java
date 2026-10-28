import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Sample {
    String id;
    String name;

    Sample(String id, String name) {
        this.id = id;
        this.name = name;
    }
    @Override 
    public boolean equals(Object o){
        if(this == o)
           return true;
        if(o==null || getClass()!=o.getClass() ){
            return false;
        }
        Sample s = (Sample) o;
        return Objects.equals(id,s.id);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    public static void main(String args[]){
        Set<Sample> samples = new HashSet<>();
        samples.add(new Sample("S1", "Blood"));
        samples.add(new Sample("S1", "Blood"));   // same data
        samples.add(new Sample("S2", "Plasma"));
        System.out.println(samples.size());
        System.out.println(new Sample("S1", "Blood").equals(new Sample("S1", "Blood")));
    }
}