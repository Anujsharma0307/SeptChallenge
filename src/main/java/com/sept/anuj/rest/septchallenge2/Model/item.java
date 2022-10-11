package com.sept.anuj.rest.septchallenge1.Model;

import java.util.ArrayList;
import java.util.List;

public class item {

    public class Item {
        public Item(){

        }
        private String id;
        private String name;
        private String desc;
        private double price;
        private List<Item> itemList;

        public Item(String id, String name, String desc, double price) {
            this.id = id;
            this.name = name;
            this.desc = desc;
            this.price = price;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public double getPrice() {
            return price;
        }
        public void setPrice(double price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return "item{" +
                    "id='" + id + '\'' +
                    ", name='" + name + '\'' +
                    ", desc='" + desc + '\'' +
                    ", price=" + price +
                    '}';
        }
        //To check the item list
        public List<Item> getItemList() {

            if(itemList == null) {

                itemList = new ArrayList<>();
            }
            return itemList;

        }
        public void setItemList(List<Item> itemList) {
            this.itemList = itemList;
        }

        // to remove an item from the list
        public void removeItem(String id){

            for (int i = 0; i < itemList.size(); i++){

                if(itemList.get(i).getId().equals(id)){

                    itemList.remove(i);
                }
            }
        }
    }

}
