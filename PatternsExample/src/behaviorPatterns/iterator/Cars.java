package behaviorPatterns.iterator;

public class Cars implements Collection{
    String [] modelCars;

    public Cars(String[] modelCars) {
        this.modelCars = modelCars;
    }

    public String[] getModelCars() {
        return modelCars;
    }

    public void setModelCars(String[] modelCars) {
        this.modelCars = modelCars;
    }

    @Override
    public Iterator getIterator() {
        return new CarsIterator();
    }
    private class CarsIterator implements Iterator{
        int idx;

        @Override
        public boolean hasNext() {
            if(idx<modelCars.length)
                return true;
            else
                return false;
        }

        @Override
        public Object next() {
            return modelCars[idx++];
        }
    }
}
