# MasterMind - Solución Cliente/Servidor

Diego Fernández Aceves - dfera10@gmail.com

Version 0.0.4

# Indice
 - [Funcionalidad gráficos](#Funcionalidad-gráficos)
 - [Vista de Lógica/Diseño](#Vista-de-LógicaDiseño)
    * [Arquitectura](#Arquitectura)
    * [Paquete mastermind](#Paquete-mastermind)
    * [Paquete mastermind.views](#Paquete-mastermindviews)
    * [Paquete mastermind.controllers](#Paquete-mastermindcontrollers)
    * [Paquete mastermind.controllers.implementation](#Paquete-mastermindcontrollersimplementation)
    * [Paquete mastermind.distributed](#Paquete-masterminddistributed)
    * [Paquete mastermind.distributed.dispatchers](#Paquete-masterminddistributeddispatchers)
    * [Paquete mastermind.distributed.proxy](#Paquete-masterminddistributedproxy)
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
 
    ![MasterMind](https://github.com/TheMercuryBeat/MasterMind/blob/Cliente/Servidor/docs/images/300px-mastermind.jpg?raw=true)
 
# Vista de Lógica/Diseño
Modelo/Vista/Presentador con presentador del modelo

* Patrón Proxy, para la ejecución distribuida

## Arquitectura
![architecture](https://github.com/TheMercuryBeat/MasterMind/blob/ClienteServidor/docs/images/MasterMindArquitecture.png?raw=true)

## Paquete mastermind
![mastermind](https://github.com/TheMercuryBeat/MasterMind/blob/ClienteServidor/docs/images/PackageMasterMind.png?raw=true)

## Paquete mastermind.views
![mastermind.views](https://github.com/TheMercuryBeat/MasterMind/blob/ClienteServidor/docs/images/PackageMasterMindViews.png?raw=true)

## Paquete mastermind.controllers
![mastermind.controllers](https://github.com/TheMercuryBeat/MasterMind/blob/ClienteServidor/docs/images/PackageMasterMindControllers.png?raw=true)

## Paquete mastermind.controllers.implementation
![mastermind.controllers](https://github.com/TheMercuryBeat/MasterMind/blob/ClienteServidor/docs/images/PackageMasterMindControllersImplementation.png?raw=true)

## Paquete mastermind.distributed
![mastermind.controllers](https://github.com/TheMercuryBeat/MasterMind/blob/ClienteServidor/docs/images/PackageMasterMindDistributed.png?raw=true)

## Paquete mastermind.distributed.dispatchers
![mastermind.controllers](https://github.com/TheMercuryBeat/MasterMind/blob/ClienteServidor/docs/images/PackageMasterMindDistributed-Dispatchers.png?raw=true)

## Paquete mastermind.distributed.proxy
![mastermind.controllers](https://github.com/TheMercuryBeat/MasterMind/blob/ClienteServidor/docs/images/PackageMasterMindDistributed-Proxy.png?raw=true)

## Paquete mastermind.models
![mastermind.models](https://github.com/TheMercuryBeat/MasterMind/blob/ClienteServidor/docs/images/PackageMasterMindModels.png?raw=true)

## Paquete mastermind.utils
![mastermind.utils](https://github.com/TheMercuryBeat/MasterMind/blob/ClienteServidor/docs/images/PackageMasterMindUtils.png?raw=true)

# Calidad del Software

## Diseño

- Baja Cohesión: de Lógica y Controladores que controlan y comunican

- Alto Acoplamiento: de Lógica y Controladores a tecnologías de comunicación
  
- Open/Close: en Lógica y Controladores cuando hay que cambiar el código de éstos con nuevas tecnologías de comunicación
  
# Vista de Desarrollo/Implementación
![development](https://github.com/TheMercuryBeat/MasterMind/blob/ClienteServidor/docs/images/MasterMindDevelopment-Mastermind.png?raw=true)
![development](https://github.com/TheMercuryBeat/MasterMind/blob/ClienteServidor/docs/images/MasterMindDevelopment-MastermindClient.png?raw=true)
![development](https://github.com/TheMercuryBeat/MasterMind/blob/ClienteServidor/docs/images/MasterMindDevelopment-MastermindServer.png?raw=true)

# Vista de Despliegue/Física
![deployment](https://github.com/TheMercuryBeat/MasterMind/blob/ClienteServidor/docs/images/MasterMindDeployment.png?raw=true)

## Vista de Procesos

-   No hay concurrencia

Last updated 2020-10-31