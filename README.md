# MasterMind. Solución domainModel
Diego Fernández Aceves - dfera10@gmail.com

Version 0.0.2

# Indice
 - [Funcionalidad básica](#Funcionalidad-básica)
 - [Vista de Lógica/Diseño](#Vista-de-LógicaDiseño)
    * Arquitectura
    * Paquete mastermind
    * Calidad del Software
        * Diseño
        * Rediseño
    * Vista de Desarrollo/Implementación
    * Vista de Despliegue/Física
    * Vista de Procesos

# Funcionalidad básica
 - [Wiki](https://en.wikipedia.org/wiki/Mastermind_(board_game))
    - Funcionalidad: Básica
    - Interfaz: Texto
    - Distribución: StandAlone
    - Persistencia: No
 
    ![MasterMind "MasterMind"](https://github.com/TheMercuryBeat/MasterMind/blob/documentView/docs/images/300px-mastermind.jpg?raw=true)
 
# Vista de Lógica/Diseño
Aplicación del Modelo del Dominio mediante Estrategias de Análisis Formal, Análisis Clásico, Experto del Dominio, Reparto de Responsabilidades.

## Arquitectura
![MasterMind "MasterMind"](https://github.com/TheMercuryBeat/MasterMind/blob/documentView/docs/images/MasterMindArquitecture.png?raw=true)

## Paquete es.urjc.mastermind
![MasterMind "MasterMind"](https://github.com/TheMercuryBeat/MasterMind/blob/documentView/docs/images/MasterMindDesignModel-MasterMind.png?raw=true) 

## Paquete es.urjc.mastermind.views
![MasterMind "MasterMind"](https://github.com/TheMercuryBeat/MasterMind/blob/documentView/docs/images/MasterMindDesignModel-MasterMindViews.png?raw=true) 

## Paquete es.urjc.mastermind.models
![MasterMind "MasterMind"](https://github.com/TheMercuryBeat/MasterMind/blob/documentView/docs/images/MasterMindDesignModel-MasterMindModels.png?raw=true) 

## Paquete es.urjc.utils
![MasterMind "MasterMind"](https://github.com/TheMercuryBeat/MasterMind/blob/documentView/docs/images/MasterMindDesignModel-MasterMindUtils.png?raw=true) 

## Calidad del Software

### Diseño

- **Método largo**: Método "play" de Mastermind

### Rediseño

- *Nueva interfaz: Gráfica*

    - ***Clases Grandes**: los Modelos asumen la responsabilidad y crecen en líneas, métodos y atributos con cada nueva tecnología*

    - ***Alto acoplamiento**: los Modelos con cada nueva tecnología de interfaz (consola, gráficos, web)*

    - ***Baja cohesión**: cada Modelo está gestionando sus atributos y las tecnologías de interfaz*

    - ***Open/Close**: hay que modificar los modelos que estaban funcionando previamente para escoger una tecnología de vista u otra (if’s anidados)*

## Vista de Desarrollo/Implementación
![MasterMind "MasterMind"](https://github.com/TheMercuryBeat/MasterMind/blob/documentView/docs/images/MasterMindDevelopment.png?raw=true)

## Vista de Despliegue/Física
![MasterMind "MasterMind"](https://github.com/TheMercuryBeat/MasterMind/blob/documentView/docs/images/MasterMindDeployment.png?raw=true)

## Vista de Procesos

-   No hay concurrencia

Last updated 2020-10-12