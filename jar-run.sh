./build.sh
mkdir mods/jarred
/Library/Java/JavaVirtualMachines/jdk-9.jdk/Contents/Home/bin/jar --create --file mods/jarred/sorting.service.api@1.0.jar --module-version=1.0 -C mods/sorting.service.api .
/Library/Java/JavaVirtualMachines/jdk-9.jdk/Contents/Home/bin/jar --create --file mods/jarred/sorting.service.bubblesort@1.0.jar --module-version=1.0 -C mods/sorting.service.bubblesort .
/Library/Java/JavaVirtualMachines/jdk-9.jdk/Contents/Home/bin/jar --create --file mods/jarred/sorting.service.mergesort@1.0.jar --module-version=1.0 -C mods/sorting.service.mergesort .
/Library/Java/JavaVirtualMachines/jdk-9.jdk/Contents/Home/bin/jar --create --file mods/jarred/sorting.service.quicksort@1.0.jar --module-version=1.0 -C mods/sorting.service.quicksort .
/Library/Java/JavaVirtualMachines/jdk-9.jdk/Contents/Home/bin/jar --create --file mods/jarred/sorting.service.selectionsort@1.0.jar --module-version=1.0 -C mods/sorting.service.selectionsort .
/Library/Java/JavaVirtualMachines/jdk-9.jdk/Contents/Home/bin/jar --create --file mods/jarred/sorting.service.insertionsort@1.0.jar --module-version=1.0 -C mods/sorting.service.insertionsort .
/Library/Java/JavaVirtualMachines/jdk-9.jdk/Contents/Home/bin/jar --create --file mods/jarred/sorting.service.application@1.0.jar --module-version=1.0 --main-class=sorting.service.application.Application -C mods/sorting.service.application .
/Library/Java/JavaVirtualMachines/jdk-9.jdk/Contents/Home/bin/java -mp mods/jarred -m sorting.service.application
