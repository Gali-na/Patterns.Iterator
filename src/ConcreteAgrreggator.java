public class ConcreteAgrreggator implements Agrigaror {
    private String [] arry = new String[]{"1","2","3","4","5","6","7","8","9","10"};

    @Override
    public MyIterator iterator() {
        return new Iterator();
    }

    private class Iterator implements MyIterator {
        int element=-1;
        @Override
        public boolean hasNext() {
            if(element<arry.length-1){
                element++;
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return arry[element];
        }
    }
}
