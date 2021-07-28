public class Practice15 {
    public static void main(String[] args) {
        System.out.println("Performance Test");
        long startTime = System.currentTimeMillis();
        StringBuffer stringBuffer = new StringBuffer("Purple Rain");
        for(int i=0;i<10000;i++){
            stringBuffer.append("Album");
        }
        System.out.println("Time taken by StringBuffer: "+ (System.currentTimeMillis() - startTime)+ " ms");

        System.out.println("************************************");

        startTime = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder("Purple Rain ");
        for(int i=0;i<10000;i++){
            stringBuilder.append("Album");
        }
        System.out.println("Time taken by StringBuilder: "+ (System.currentTimeMillis()- startTime)+ " ms");

    }
}
