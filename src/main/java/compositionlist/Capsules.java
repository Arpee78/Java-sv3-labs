package compositionlist;

import java.util.ArrayList;
import java.util.List;

public class Capsules {

    private List<String> colors = new ArrayList<>();

    public List<String> getColors() {
        return colors;
    }

    public void addLast(String newColor){
        colors.add(newColor);
    }

    public void addFirst(String newColor){
        colors.add(0, newColor);
    }

    public void removeFirst(){
//        colors.removeFirst();
        colors.remove(0);
    }

    public void removeLast(){
//        colors.removeLast();
        colors.remove(colors.size()-1);
    }

    public static void main(String[] args) {
        Capsules capsules = new Capsules();
        capsules.addLast("red");
        capsules.addLast("green");
        capsules.addLast("blue");
        System.out.println(capsules.getColors());
        capsules.addFirst("white");
        System.out.println(capsules.getColors());
        capsules.removeFirst();
        System.out.println(capsules.getColors());
        capsules.removeLast();
        System.out.println(capsules.getColors());
    }

}
