package Collections;
/*
1.For TreeMap,HashMap duplicate keys will be updated with
Latest Values
2.If you try to equate to custom objects you should override equals() method
3.hashCode() method can also be overridded.
4. While implementing Tree map or Tree set whith custom objects as Keys
it is important to implement either comparable interface or
Comparator class(by creating new classes ot objects
5. We have put(key , value),get(key) method in Map
6. We have Map.Entry class which helps us to use getKey() and getValue() methods
*/

import java.util.*;
class Code1 implements Comparable<Code1> {
    private String sectionNo;
    private String lectureNo;

    public Code1(String sectionNo, String lectureNo) {
        super();
        this.sectionNo = sectionNo;
        this.lectureNo = lectureNo;
    }

    public String getSectionNo() {
        return sectionNo;
    }

    public String getLectureNo() {
        return lectureNo;
    }

    @Override
    public String toString() {
        return "Code [sectionNo=" + sectionNo + ", lectureNo=" + lectureNo + "]";
    }

    @Override
    public int compareTo(Code1 o) {
        String code1 = sectionNo.concat(lectureNo);
        String code2 = o.getSectionNo() + o.getLectureNo();
        return code1.compareTo(code2);
    }
//    @Override
//    public int hashCode() {
//        final int prime = 31;
//        int result = 1;
//        result = prime * result + ((lectureNo == null) ? 0 : lectureNo.hashCode());
//        result = prime * result + ((sectionNo == null) ? 0 : sectionNo.hashCode());
//        return result;
//    }
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj)
//            return true;
//        if (obj == null)
//            return false;
//        if (getClass() != obj.getClass())
//            return false;
//        Code1 other = (Code1) obj;
//        if (lectureNo == null) {
//            if (other.lectureNo != null)
//                return false;
//        } else if (!lectureNo.equals(other.lectureNo))
//            return false;
//        if (sectionNo == null) {
//            if (other.sectionNo != null)
//                return false;
//        } else if (!sectionNo.equals(other.sectionNo))
//            return false;
//        return true;
//    }




    public boolean equals(Code1 c) {

        if (getClass() != c.getClass()) {
            return false;
        }
        if (sectionNo.equals(c.sectionNo) == false) {
            return false;
        }
        if (lectureNo.equals(c.lectureNo) == false) {
            return false;
        }

        return true;

    }
}

public class EqualsnHashCodeClass {

    public static void main(String[] args) {
        Map<Code1,String> lectures = new TreeMap<>();
        lectures.put(new Code1("S01","L03"), "Generics");
        lectures.put(new Code1("S01","L01"), "Files under Java");
        lectures.put(new Code1("S02","L03"), "Network programming");
        lectures.put(new Code1("S01","L07"), "OOPS");
        lectures.put(new Code1("S01","L05"), "Methods");
        lectures.put(new Code1("S01","L03"), "Expressions");

        for(Map.Entry<Code1, String> entry: lectures.entrySet()){
            // System.out.println("Key: "+entry.getKey()+" Value: "+entry.getValue());
        }
        //System.out.println(lectures);

        Code1 code1 =  new Code1("S01","L03");
        Code1 code2 = new Code1("S01","L23");

        System.out.println("S01".hashCode()+"L03".hashCode());


        System.out.println("HashCode of Code1 "+code1.hashCode()+" HashCode of Code2 "+code2.hashCode());
        System.out.println(code1.equals(code2));
        System.out.println(code1 == code2);

        for(Map.Entry<Code1,String> entry:lectures.entrySet()){
            if(entry.getValue() == "OOPS"){
                System.out.println(" The Key of \"OOPS\" is "+entry.getKey());
            }

        }
        System.out.println(lectures.get(code2));




    }
}
