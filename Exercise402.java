

public class Exercise402 {
    public static void main(String[] args) {
        Float float1 = new Float("9.6175");
        Float float2 = new Float("7.38126");
        Float float3 = new Float("2347.373");

        System.out.println("-- Using compareTo --");
        System.out.println(float1.compareTo(float3));           // -1
        System.out.println(float2.compareTo(float3));           // -1
        System.out.println(float1.compareTo(float1));           // 0
        System.out.println(float3.compareTo(float2));           // 1


        System.out.println("-- Using compare --");
        System.out.println(Float.compare(float1, float3));      // -1
        System.out.println(Float.compare(float2, float3));      // -1
        System.out.println(Float.compare(float1, float1));      // 0
        System.out.println(Float.compare(float3, float2));      // 1
    }
}
