<?php

class generationKey{
    /*$tabK est la valeur initial de k*/
    private static $tabk=[0,1,1,0,1,1,0,1];
    private static $K1=[];
    private static $K2=[];
    private static $k1=[];
    private static $k2=[];

    public static function generateKey()
    {
        /*en sachant que notre h =65274130 */
        $Hk=array($tabk[6],$tabk[5],$tabk[2],$tabk[7],$tabk[4],$tabk[1],$tabk[3],$tabk[0]);
        for($i=0;i<$Hk.count()/2;$i++)
        {
            $k1[$i]=$Hk[$i];
        }
        $j=0;
        for($i=7;$i>$Hk.count()/2;$i--)
        {
            $k2[$j]=$Hk[$i];
            $j++;
        }
        /* appliquons K1=k1'xor k2'*/
        for($i=0;$i<$k1;$k1++)
        {
            if($k1[$i]==$k2[$i])
            {
                $K1[$i]=0;
            }else{
                $K1[$i]=1;
            }
        }

             /* appliquons K2=k1'   and k2'*/
             for($i=0;$i<$k1;$k1++)
             {
                 $K2[$i]=($k1[$i] && $k2[$i]);
             }
    }

    public static function getDecalK1()
    {/* application de decallage à gauche pour k1*/
        return [$K1[2],$K1[3],$K1[1],$K[0]];
    }

    public static function getDecalK2()
    {{/* application de decallage à gauche pour k2*/
        return [$K2[2],$K2[0],$K2[1],$K2[3]];
    }

   

}