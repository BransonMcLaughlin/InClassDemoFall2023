public class FavoriteList extends ListADT<Favorite>{

    private Favorite[] favorites;
    private int numFavorites;
    private static final int MAX_FAVORITES = 50;

    public FavoriteList(){
        this.numFavorites = 0;
        this.favorites = new Favorite[MAX_FAVORITES];
    }

    
    @Override
    public int size() {
        // TODO Auto-generated method stub
        return this.numFavorites;
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return (this.numFavorites ==0);
        // returns true or false without if statement
    }

    @Override
    public void removeAll() {
        // TODO Auto-generated method stub
         this.numFavorites = 0;
        this.favorites = new Favorite[MAX_FAVORITES];
    }

    @Override
    public void add(int index, Favorite newFave) throws ListException {
        // TODO Auto-generated method stub
        if(index < 0 || index > this.size())
            throw new ListException("Index " + index + " is invalid fo a list of size: " + this.size());

        if(index >= MAX_FAVORITES)
            throw new ListException("Index exceeds the maximum allowed size of the list: " + MAX_FAVORITES);

        for(int i = this.size(); i > index; i--){
            this.favorites[i] = this.favorites[i-1];
        }
        this.favorites[index] = newFave;
        this.numFavorites++;
    }

    @Override
    public Favorite get(int index) throws ListException {
        // TODO Auto-generated method stub
        if (index < 0 || index >= this.size() )
            throw new ListException("Index " + index + " is invalid fo a list of size: " + this.size());

        return this.favorites[index];
    }

    @Override
    public void remove(int index) throws ListException {
        // TODO Auto-generated method stub
        if (index < 0 || index >= this.size() )
            throw new ListException("Index " + index + " is invalid fo a list of size: " + this.size());

        for(int i = index+1; i < this.size(); i++){
            this.favorites[i-1] = this.favorites[i];
        }

        this.numFavorites--;
    }

    @Override
    public String toString(){
        String s = " ";
        for (int i = 0; i < this.size(); i++)
            s = s + i + " : " + this.get(i) + "\n";

            return s;
    }

        
}

    

