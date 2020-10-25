# MasterMind - Solución mvp.pm.withComposite

Diego Fernández Aceves - dfera10@gmail.com

Version 0.0.4

# Indice
 - [Funcionalidad gráficos](#Funcionalidad-gráficos)
 - [Vista de Lógica/Diseño](#Vista-de-LógicaDiseño)
    * [Arquitectura](#Arquitectura)
    * [Paquete mastermind](#Paquete-mastermind)
    * [Paquete mastermind.views](#Paquete-mastermindviews)
    * [Paquete mastermind.controllers](#Paquete-mastermindcontrollers)
    * [Paquete mastermind.models](#Paquete-mastermindmodels)
    * [Paquete mastermind.utils](#Paquete-mastermindutils)
 - [Calidad del Software](#Calidad-del-Software)
    * [Diseño](#Diseño)
 - [Vista de Desarrollo/Implementación](#Vista-de-DesarrolloImplementación)
 - [Vista de Despliegue/Física](#Vista-de-DespliegueFísica)
 - [Vista de Procesos](#Vista-de-Procesos)

# Funcionalidad gráficos
 - [Wiki](https://en.wikipedia.org/wiki/Mastermind_(board_game))
    - Funcionalidad: Gráficos
    - Interfaz: Texto
    - Distribución: StandAlone
    - Persistencia: No
 
    ![MasterMind](https://github.com/TheMercuryBeat/MasterMind/blob/mvp.pm.withComposite/docs/images/300px-mastermind.jpg?raw=true)
 
# Vista de Lógica/Diseño
Modelo/Vista/Presentador con presentador del modelo

* Patrón Command, para el menú

* Patrón Composite, para multi-controladores

* Patrón Memento, para la funcionalidad undo/redo

## Arquitectura
![architecture](https://github.com/TheMercuryBeat/MasterMind/blob/mvp.pm.withComposite/docs/images/MasterMindArquitecture.png?raw=true)

## Paquete mastermind
![mastermind](https://github.com/TheMercuryBeat/MasterMind/blob/mvp.pm.withComposite/docs/images/PackageMasterMind.png?raw=true)

## Paquete mastermind.views
![mastermind.views](https://github.com/TheMercuryBeat/MasterMind/blob/mvp.pm.withComposite/docs/images/PackageMasterMindViews.png?raw=true)

## Paquete mastermind.controllers
![mastermind.controllers](https://github.com/TheMercuryBeat/MasterMind/blob/mvp.pm.withComposite/docs/images/PackageMasterMindControllers.png?raw=true)

## Paquete mastermind.models
![mastermind.models](https://github.com/TheMercuryBeat/MasterMind/blob/mvp.pm.withComposite/docs/images/PackageMasterMindModels.png?raw=true)

## Paquete mastermind.utils
![mastermind.utils](https://github.com/TheMercuryBeat/MasterMind/blob/mvp.pm.withComposite/docs/images/PackageMasterMindUtils.png?raw=true)

# Calidad del Software

## Diseño

- **Principio de Sustitución de Liskov**: las vistas preguntan por el tipo de controlador polimórfico
  
# Vista de Desarrollo/Implementación
![development](https://github.com/TheMercuryBeat/MasterMind/blob/mvp.pm.withComposite/docs/images/MasterMindDevelopment.png?raw=true)

# Vista de Despliegue/Física
![deployment](https://github.com/TheMercuryBeat/MasterMind/blob/mvp.pm.withComposite/docs/images/MasterMindDeployment.png?raw=true)

## Vista de Procesos

-   No hay concurrencia

Last updated 2020-10-18