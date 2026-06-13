class MedianFinder {
     PriorityQueue<Integer> minheap;
     PriorityQueue<Integer> maxheap;
    public MedianFinder() {
       minheap=new PriorityQueue<>();
       maxheap=new PriorityQueue<>(Collections.reverseOrder()); 
    }
    
    public void addNum(int num) {
        if(maxheap.isEmpty() || num<=maxheap.peek())
        {
            maxheap.add(num);
        } 
        else{
            minheap.add(num);
        }
        if(maxheap.size()>minheap.size()+1)
        {
            minheap.add(maxheap.poll());
        }
        else if(minheap.size()>maxheap.size())
        {
            maxheap.add(minheap.poll());
        }
    }
    
    public double findMedian() {
       if(minheap.size()==maxheap.size())
       {
        double med=(double)(minheap.peek()+maxheap.peek())/2;
        return med;
       } 
       else if(minheap.size()>maxheap.size())
        {
            return (double)minheap.peek();
        }
        return (double)maxheap.peek();
    }
}
