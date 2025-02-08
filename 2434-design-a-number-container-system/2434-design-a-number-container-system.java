class NumberContainers {
    private Map<Integer,Integer> ixnum=new HashMap();
    private Map<Integer,TreeSet<Integer>> numix=new HashMap();
    Map <Integer,Integer> mp=new HashMap();
    public NumberContainers() {
    }
    
    public void change(int index, int number) {
        if((ixnum.containsKey(index))){
            int currn=ixnum.get(index);
            if(numix.containsKey(currn)){
                numix.get(currn).remove(index);
                if(numix.get(currn).isEmpty())
                numix.remove(currn);
            }
        }
        ixnum.put(index,number);
        numix.putIfAbsent(number,new TreeSet<>());
        numix.get(number).add(index);
    }
    
    public int find(int number) {
        if(numix.containsKey(number)){
            return numix.get(number).first(); 
        }
        return -1;
    }
}

/**
 * Your NumberContainers object will be instantiated and called as such:
 * NumberContainers obj = new NumberContainers();
 * obj.change(index,number);
 * int param_2 = obj.find(number);
 */