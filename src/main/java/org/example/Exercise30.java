package org.example;

public class Exercise30 {

        public static void main(String[] args) {

            int SizeofTable = 12;

            printMTable(SizeofTable);

        }

        public static void printMTable(int SizeofTable) {

            // first print the top header row

            System.out.format("      ");

            for(int i = 1; i<=SizeofTable;i++ ) {

                System.out.format("%4d",i);

            }

            System.out.println();


            for(int i = 1 ;i<=SizeofTable;i++) {

                // print left most column first

                System.out.format("%4d ",i);

                for(int k=1;k<=SizeofTable;k++) {

                    System.out.format("%4d",i*k);

                }

                System.out.println();

            }

        }

    }
