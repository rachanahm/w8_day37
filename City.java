//Create a class called "City" with attributes "name" and "population". Create an ArrayList of City objects and add 3 cities to it. Print the name and population of each city. Increase the population of one city by 100,000 and print the updated information.
import java.util.ArrayList;

class City {
    private String name;
    private int population;
    
    public City(String name, int population) {
        this.name = name;
        this.population = population;
    }
    
    public String getName() {
        return name;
    }
    
    public int getPopulation() {
        return population;
    }
    
    public void setPopulation(int population) {
        this.population = population;
    }
}

 class city {
    public static void main(String[] args) {
        ArrayList<City> cities = new ArrayList<>();
        
        City city1 = new City("Mangalore", 8399000);
        City city2 = new City("Hassan", 3997000);
        City city3 = new City("Bangalore", 2695000);
        
        cities.add(city1);
        cities.add(city2);
        cities.add(city3);
        
        // Print city information
        for (City city : cities) {
            System.out.println("City: " + city.getName() + " Population: " + city.getPopulation());
        }
        
        // Update population of one city
        city2.setPopulation(city2.getPopulation() + 100000);
        
        // Print updated city information
        System.out.println("City: " + city2.getName() + " Updated Population: " + city2.getPopulation());
    }
}
