/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ödev;

import java.util.Scanner;



/**
 *
 * @author 10809
 */
public class S200316007 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int guests, type,press,childrenNumber,VIP;
    int extraPeople=0;
    int epwc=0;
    int extraChildren=0;
    double baseprice=0;
    double price=0;
    int day=0;
    int stay=0;
    double fprice=0;
    int reservasion=0;
    int daynumber=0;
    Scanner input = new Scanner(System.in);
        System.out.println("how many guests stay with you at hotel?");
       guests= input.nextInt();
       if(guests ==1)
       {
           System.out.println(280);
           baseprice=280;
       }
       else if(guests >1)
       {
            System.out.println("Will you stay with your family or your friends(type 1 for family type 2 for friends)");
            type= input.nextInt();
            if (type ==2)
            {
                if(guests==2)
                {
                    System.out.println(200*2);
                    baseprice=400;
                }
                else if(guests==3)
                {
                    System.out.println(170*3);
                    baseprice=510;
                }
                else if(guests==4)
                {
                    System.out.println(150*4);
                    baseprice=600;
                }
                else if(guests>4)
                {
           
            extraPeople=guests%4;
            if(extraPeople==0)
            {
                System.out.println(guests/4*150*guests);
                baseprice=guests/4*150*guests;
            }
            else if(extraPeople==1)
            {
                System.out.println(guests/4*150*guests+280);
                baseprice=guests/4*150*guests+280;
            }
            else if(extraPeople==2)
            {
                System.out.println(guests/4*150*guests+200*2);
                baseprice=guests/4*150*guests+200*2;
            }
            else if(extraPeople==3)
            {
                System.out.println(guests/4*150*guests+170*3);
                baseprice=guests/4*150*guests+170*3;
            }
          }
        }
          else if (type==1)
            {
                System.out.println("Do you have children?(press 3 for yes and 4 for no)");
                press= input.nextInt();
                if(press==4)
                {
                    if(guests==2)
                    {
                        System.out.println(200*2);
                        baseprice=400;
                    }
                    else if(guests==3)
                    {
                        System.out.println(170*3);
                        baseprice=510;
                    }
                    else if(guests==4)
                    {
                        System.out.println("150*4");
                        baseprice=600;
                    }
                    else if(guests>4)
                    {
                        if(extraPeople==0)
                        {
                            System.out.println(guests/4*150*guests);
                            baseprice=guests/4*150*guests;
                        }
                        else if(extraPeople==1)
                        {
                            System.out.println(guests/4*150*guests+280);
                            baseprice=guests/4*150*guests+280;
                        }
                        else if(extraPeople==2)
                        {
                            System.out.println(guests/4*150*guests+200*2);
                            baseprice=guests/4*150*guests+200*2;
                        }
                        else if(extraPeople==3)
                        {
                            System.out.println(guests/4*150*guests+170*3);
                            baseprice=guests/4*150*guests+170*3;
                        }
                    }
                }
           
                else if (press==3)
                {
                    System.out.println("How many children do you have?");
                    childrenNumber= input.nextInt();
                        if(childrenNumber==1)
                        {
                        if(guests==2)
                        {
                        System.out.println(380);
                        baseprice=380;
                        }
                        else if(guests==3)
                        {
                            System.out.println(500);
                            baseprice=500;
                        }   
                        else if(guests==4)
                        {
                            System.out.println(595);
                            baseprice=595;
                        }
                        else if(guests ==5)
                        {
                            System.out.println(675);
                            baseprice=675;
                        }
                        else if(guests >5)
                        {
                        epwc=(guests-childrenNumber)%4;
                        if(epwc==0)
                        {
                           System.out.println((guests-1)/4*150*4+75);
                           baseprice=(guests-1)/4*150*4+75;
                        }
                        else if(epwc==1)
                        {
                            System.out.println((guests-1)/4*150*4+380);
                            baseprice=(guests-1)/4*150*4+380;
                        }
                        else if(epwc==2)
                        {
                            System.out.println((guests-1)/4*150*4+500);
                            baseprice=(guests-1)/4*150*4+500;
                        }
                        else if(epwc==3)
                        {
                            System.out.println((guests-1)/4*150*4+595);
                            baseprice=(guests-1)/4*150*4+595;
                        }
                        
                        }
                        
                  
                   }
                        else if(childrenNumber>1)
                        {
                        if(childrenNumber==2)
                        {
                        if(guests-childrenNumber==1)
                        {
                            System.out.println(580);
                            baseprice=580;
                      }
                        else if(guests-childrenNumber==2)
                        {
                            System.out.println(700);
                            baseprice=700;
                        }
                        else if(guests-childrenNumber==3)
                        {
                            System.out.println(810);
                            baseprice=810;
                        }
                        else if(guests-childrenNumber==4)
                        {
                            System.out.println(900);
                            baseprice=900;
                        }
                        else if (guests-childrenNumber>4)
                        {
                        if(epwc==0)
                        {
                            System.out.println((guests-childrenNumber)/4*150*4+300);
                            baseprice=(guests-childrenNumber)/4*150*4+300;
                         }
                        else if(epwc==1)
                        {
                            System.out.println((guests-childrenNumber)/4*150*4+280+300);
                            baseprice=(guests-childrenNumber)/4*150*4+280+300;
                        }
                        else if(epwc==2)
                        {
                            System.out.println((guests-childrenNumber)/4*150*4+400+300);
                            baseprice=(guests-childrenNumber)/4*150*4+400+300;
                        }
                        else if(epwc==3)
                        {
                            System.out.println((guests-childrenNumber)/4*150*4+510+300);
                            baseprice=(guests-childrenNumber)/4*150*4+510+300;
                        }
                        }
                                    
                        }
                        else if(childrenNumber==3)
                        {
                        {
                        if(guests-childrenNumber==1)
                        {
                            System.out.println(280+382.5);
                            baseprice=280+382.5;
                      }
                        else if(guests-childrenNumber==2)
                        {
                            System.out.println(400+382.5);
                            baseprice=782.5;
                        }
                        else if(guests-childrenNumber==3)
                        {
                            System.out.println(510+382.5);
                            baseprice=510+382.5;
                        }
                        else if(guests-childrenNumber==4)
                        {
                            System.out.println(600+382.5);
                            baseprice=600+382.5;
                        }
                        else if (guests-childrenNumber>4)
                        {
                        if(epwc==0)
                        {
                            System.out.println((guests-childrenNumber)/4*150*4+382.5);
                            baseprice=(guests-childrenNumber)/4*150*4+382.5;
                         }
                        else if(epwc==1)
                        {
                            System.out.println((guests-childrenNumber)/4*150*4+280+382.5);
                            baseprice=(guests-childrenNumber)/4*150*4+280+382.5;
                        }
                        else if(epwc==2)
                        {
                            System.out.println((guests-childrenNumber)/4*150*4+400+382.5);
                            baseprice=(guests-childrenNumber)/4*150*4+400+382.5;
                        }
                        else if(epwc==3)
                        {
                            System.out.println((guests-childrenNumber)/4*150*4+510+382.5);
                            baseprice=(guests-childrenNumber)/4*150*4+510+382.5;
                        }
                 }
               }
                        
                                
            }
                        else if(childrenNumber==4)
                        {
                        {
                        if(guests-childrenNumber==1)
                        {
                            System.out.println(280+450);
                            baseprice=280+450;
                      }
                        else if(guests-childrenNumber==2)
                        {
                            System.out.println(400+450);
                            baseprice=400+450;
                        }
                        else if(guests-childrenNumber==3)
                        {
                            System.out.println(510+450);
                            baseprice=510+450;
                        }
                        else if(guests-childrenNumber==4)
                        {
                            System.out.println(600+450);
                            baseprice=600+450;
                        }
                        else if (guests-childrenNumber>4)
                        {
                        if(epwc==0)
                        {
                            System.out.println((guests-childrenNumber)/4*150*4+450);
                            baseprice=(guests-childrenNumber)/4*150*4+450;
                         }
                        else if(epwc==1)
                        {
                            System.out.println((guests-childrenNumber)/4*150*4+280+450);
                            baseprice=(guests-childrenNumber)/4*150*4+280+450;
                        }
                        else if(epwc==2)
                        {
                            System.out.println((guests-childrenNumber)/4*150*4+400+450);
                            baseprice=(guests-childrenNumber)/4*150*4+400+450;
                        }
                        else if(epwc==3)
                        {
                            System.out.println((guests-childrenNumber)/4*150*4+510+450);
                            baseprice=(guests-childrenNumber)/4*150*4+510+450;
                        }
           }
          }
         }
                        else if(childrenNumber>4)
                        {
                            extraChildren=childrenNumber%4;
                            if(extraChildren==1)
                        {
                          if(guests-childrenNumber==1)
                          {
                              System.out.println(280+childrenNumber/4*150*4*3/4+100);
                              baseprice=280+childrenNumber/4*150*4*3/4+100;
                          }
                          else if(guests-childrenNumber==2)
                          {
                              System.out.println(400+childrenNumber/4*150*4*3/4+100);
                              baseprice=400+childrenNumber/4*150*4*3/4+100;
                          }
                          else if(guests-childrenNumber==3)
                          {
                              System.out.println(510+childrenNumber/4*150*4*3/4+100);
                              baseprice=510+childrenNumber/4*150*4*3/4+100;
                          }
                          else if(guests-childrenNumber==4)
                          {
                              System.out.println(600+childrenNumber/4*150*4*3/4+100);
                              baseprice=600+childrenNumber/4*150*4*3/4+100;
                          }
                          else if(guests-childrenNumber>4)
                          {
                          if(epwc==0)
                          {
                              System.out.println((guests-childrenNumber)/4*150*4+childrenNumber/4*150*4*3/4+100);
                              baseprice=(guests-childrenNumber)/4*150*4+(childrenNumber/4*150*4*3/4+100);
                          }
                          else if(epwc==1)
                          {
                              System.out.println((guests-childrenNumber)/4*150*4+280+childrenNumber/4*150*4*3/4+100);
                              baseprice=(guests-childrenNumber)/4*150*4+280+(childrenNumber/4*150*4*3/4+100);
                          }
                          else if(epwc==2)
                          {
                              System.out.println((guests-childrenNumber)/4*150*4+400+childrenNumber/4*150*4*3/4+100);
                              baseprice=(guests-childrenNumber)/4*150*4+400+childrenNumber/4*150*4*3/4+100;
                          }
                          else if(epwc==3)
                          {
                              System.out.println((guests-childrenNumber)/4*150*4+510+childrenNumber/4*150*4*3/4+100);
                              baseprice=(guests-childrenNumber)/4*150*4+510+childrenNumber/4*150*4*3/4+100;
                          }
           }
          }
                            else if(extraChildren==2)
                            {
                            {
                          if(guests-childrenNumber==1)
                          {
                              System.out.println(280+childrenNumber/4*150*4*3/4+300);
                              baseprice=280+childrenNumber/4*150*4*3/4+300;
                          }
                          else if(guests-childrenNumber==2)
                          {
                              System.out.println(400+childrenNumber/4*150*4*3/4+300);
                              baseprice=400+childrenNumber/4*150*4*3/4+300;
                          }
                          else if(guests-childrenNumber==3)
                          {
                              System.out.println(510+childrenNumber/4*150*4*3/4+300);
                              baseprice=510+childrenNumber/4*150*4*3/4+300;
                          }
                          else if(guests-childrenNumber==4)
                          {
                              System.out.println(600+childrenNumber/4*150*4*3/4+300);
                              baseprice=600+childrenNumber/4*150*4*3/4+300;
                          }
                          else if(guests-childrenNumber>4)
                          {
                          if(epwc==0)
                          {
                              System.out.println((guests-childrenNumber)/4*150*4+childrenNumber/4*150*4*3/4+300);
                              baseprice=(guests-childrenNumber)/4*150*4+childrenNumber/4*150*4*3/4+300;
                          }
                          else if(epwc==1)
                          {
                              System.out.println((guests-childrenNumber)/4*150*4+280+childrenNumber/4*150*4*3/4+300);
                              baseprice=(guests-childrenNumber)/4*150*4+280+childrenNumber/4*150*4*3/4+300;
                          }
                          else if(epwc==2)
                          {
                              System.out.println((guests-childrenNumber)/4*150*4+400+childrenNumber/4*150*4*3/4+300);
                              baseprice=(guests-childrenNumber)/4*150*4+400+childrenNumber/4*150*4*3/4+300;
                          }
                          else if(epwc==3)
                          {
                              System.out.println((guests-childrenNumber)/4*150*4+510+childrenNumber/4*150*4*3/4+300);
                              baseprice=(guests-childrenNumber)/4*150*4+510+childrenNumber/4*150*4*3/4+300;
                          }
                }
              }
          }
                            else if(extraChildren==3)
                            {
                            {
                          if(guests-childrenNumber==1)
                          {
                              System.out.println(280+childrenNumber/4*150*4*3/4+382.5);
                              baseprice=280+childrenNumber/4*150*4*3/4+382.5;
                          }
                          else if(guests-childrenNumber==2)
                          {
                              System.out.println(400+childrenNumber/4*150*4*3/4+382.5);
                              baseprice=400+childrenNumber/4*150*4*3/4+382.5;
                          }
                          else if(guests-childrenNumber==3)
                          {
                              System.out.println(510+childrenNumber/4*150*4*3/4+382.5);
                              baseprice=510+childrenNumber/4*150*4*3/4+382.5;
                          }
                          else if(guests-childrenNumber==4)
                          {
                              System.out.println(600+childrenNumber/4*150*4*3/4+382.5);
                              baseprice=600+childrenNumber/4*150*4*3/4+382.5;
                          }
                          else if(guests-childrenNumber>4)
                          {
                          if(epwc==0)
                          {
                              System.out.println((guests-childrenNumber)/4*150*4+childrenNumber/4*150*4*3/4+382.5);
                              baseprice=(guests-childrenNumber)/4*150*4+childrenNumber/4*150*4*3/4+382.5;
                          }
                          else if(epwc==1)
                          {
                              System.out.println((guests-childrenNumber)/4*150*4+280+childrenNumber/4*150*4*3/4+382.5);
                              baseprice=(guests-childrenNumber)/4*150*4+280+childrenNumber/4*150*4*3/4+382.5;
                          }
                          else if(epwc==2)
                          {
                              System.out.println((guests-childrenNumber)/4*150*4+400+childrenNumber/4*150*4*3/4+382.5);
                              baseprice=(guests-childrenNumber)/4*150*4+400+childrenNumber/4*150*4*3/4+382.5;
                          }
                          else if(epwc==3)
                          {
                              System.out.println((guests-childrenNumber)/4*150*4+510+childrenNumber/4*150*4*3/4+382.5);
                              baseprice=(guests-childrenNumber)/4*150*4+510+childrenNumber/4*150*4*3/4+382.5;
                          }
                  }
                 }
                }
                            else if(extraChildren==0)
                            {
                            {
                          if(guests-childrenNumber==1)
                          {
                              System.out.println(280+childrenNumber/4*150*4*3/4);
                              baseprice=280+childrenNumber/4*150*4*3/4;
                          }
                          else if(guests-childrenNumber==2)
                          {
                              System.out.println(400+childrenNumber/4*150*4*3/4);
                              baseprice=400+childrenNumber/4*150*4*3/4;
                          }
                          else if(guests-childrenNumber==3)
                          {
                              System.out.println(510+childrenNumber/4*150*4*3/4);
                              baseprice=510+childrenNumber/4*150*4*3/4;
                          }
                          else if(guests-childrenNumber==4)
                          {
                              System.out.println(600+childrenNumber/4*150*4*3/4);
                              baseprice=600+childrenNumber/4*150*4*3/4;
                          }
                          else if(guests-childrenNumber>4)
                          {
                          if(epwc==0)
                          {
                              System.out.println((guests-childrenNumber)/4*150*4+childrenNumber/4*150*4*3/4);
                              baseprice=(guests-childrenNumber)/4*150*4+childrenNumber/4*150*4*3/4;
                          }
                          else if(epwc==1)
                          {
                              System.out.println((guests-childrenNumber)/4*150*4+280+childrenNumber/4*150*4*3/4);
                              baseprice=(guests-childrenNumber)/4*150*4+280+childrenNumber/4*150*4*3/4;
                          }
                          else if(epwc==2)
                          {
                              System.out.println((guests-childrenNumber)/4*150*4+400+childrenNumber/4*150*4*3/4);
                              baseprice=(guests-childrenNumber)/4*150*4+400+childrenNumber/4*150*4*3/4;
                          }
                          else if(epwc==3)
                          {
                              System.out.println((guests-childrenNumber)/4*150*4+510+childrenNumber/4*150*4*3/4);
                              baseprice=(guests-childrenNumber)/4*150*4+510+childrenNumber/4*150*4*3/4;
                          }
                   }
                 }
               }
         }
        }
       }
      }
     }
                            System.out.println("Your base price is "+baseprice);
                            System.out.println("Are you a VIP member? (type 1 for yes and type 2 for no)");
                            VIP=input.nextInt();
                            if(VIP==1)
                            {
                            System.out.println("We are discounting %5 your  base price because you are a VIP member so your new base price is "+baseprice*95/100);
                            price=baseprice*95/100;
                            }
                            else if(VIP==2)
                            {
                                System.out.println("Unfortunately, we can't discount your base price");
                                price=baseprice;
                            }
                            System.out.println("How many days will you stay? (type 1 for 1-2 days, type 2 for 4-7 days and type 3 for more than 7 days)");
                            day=input.nextInt();
                            if(day==1)
                            {
                                System.out.println("Are you stay in weekdays or weekend? (type 1 for weekdays and type 2 for weekend)");
                               stay=input.nextInt();
                                if(stay==1)
                               {
                                   System.out.println("We are goingt to %3 extra discount for you. Your new base price is "+price*97/100);
                                   fprice=price*97/100;
                               }
                                else if(stay==2)
                                {
                                    System.out.println("Unfortunately, we can't discount your base price");
                                    fprice=price;
                                }
                            }
                            else if(day==2)
                            {
                                System.out.println("We are goingt to %4 extra discount for you. Your new base price is "+price*96/100);
                                fprice=price*96/100;
                            }
                            else if(day==3)
                            {
                                System.out.println("We are goingt to %6 extra discount for you. Your new base price is "+price*94/100);
                                fprice=price*94/100;
                            }
                            System.out.println("Enter the number of days you will stay");
                            daynumber=input.nextInt();
                            System.out.println("This is your final price "+ fprice*daynumber + " would you like to have reservasion? (type 1 for yes and 2 for no)");
                            reservasion=input.nextInt();
                            if(reservasion==2)
                            {
                                System.out.println("Hope to see you soon, have a nice day.");
                            }
                            else if(reservasion==1)
                            {
                                System.out.println("You booked have a nice holiday");
                            }
    }
  }
                
            
          
        
       
          
          
          
          
          
          
          
                 
           
            
           
            
                
            
          
          
                  
                      
                  
          
             
        
        
            
        
       
      
    

    
        
    
   
   

