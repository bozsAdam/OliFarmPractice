# OliFarmPractice

A practice exercise, description for it is here:

In the far future people on Mars developed multiple special plants with special effects, which were able to grow food more efficient based on their nature.
There could be 3 types of plants on a farm: almond trees, spruces and junipers. At least 2 of every type is present. The farm knows the total food produced.
All plants produces food every month (Spruce-26, Almond-50, Juniper-14), which can be boosted or reduceed by different events. Every month the production of each is growing by 4 by default.
Since Spruces and Junipers are evergreens, they can grow leaves by their own every 5 month, increasing their production by 8. These two can also be at max production at 70 (can't be more than that), at that point they speak and say "<Name> at full production!".
Almond trees on the other hand are very effective, when their production falls below 40, it is doubled!
Both almond trees and spruces have special attributes, they can grow a shroom every month, which have a chance (almond: 8%, spruce: 5%) that boosts the production by (almond: 10, spruce: 15) of that plant. Both plant can also rot every month with a chance of (almond: 13%, spruce: 4%) which reduces their production by (almond: 18, spruce: 20). Shroom growing always happens first! When any plant has rot, no food is produced at all that month.
What is the production total on the farm after 80 months?
