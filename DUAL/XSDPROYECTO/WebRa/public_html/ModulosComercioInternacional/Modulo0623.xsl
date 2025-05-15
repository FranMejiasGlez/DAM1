<?xml version="1.0" encoding="UTF-8"?>


<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>

    <xsl:template match="/">
        <xsl:variable name="codigoModulo" select="'0623'"></xsl:variable>
        <xsl:variable name="codigoTitulo" select="2"></xsl:variable>
        <html>

            <head>
                <meta charset="utf-8"/>
                <meta name="viewport" content="width=device-width, initial-scale=1"/>
                <link rel="stylesheet" href="../stylesheet3.css"/>
                <link
                    href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
                    rel="stylesheet"/>
                <script
                    src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js">
                </script>
                <title> 
                    <xsl:value-of select="//Titulos/Titulo[$codigoTitulo]/@Nombre"></xsl:value-of>
                </title>
            </head>

            <body>
                <div class="header">
                    <div class="logo-header">
                        <img src="../img/eusa2021.jpg" alt="Eusa Campus Camara Sevilla"
                             width="222px" height="79px"/>
                    </div>
                    <ul>
                        <li class="links-header">
                            <br></br>
                            <a>
                                <strong>Servicios socioculturales y a la
                                    comunidad</strong>
                            </a>
                        </li>
                        <li class="links-header">
                            <a>
                                <strong>Informática y videojuegos</strong>
                            </a>
                        </li>
                        <li class="links-header">
                            <a>
                                <strong>Administración, marketing y comercio</strong>
                            </a>
                        </li>
                        <li class="links-header">
                            <a>
                                <strong>Imagen y Sonido</strong>
                            </a>
                        </li>
                        <li class="links-header">
                            <a>
                                <strong>Hosteleria y turismo</strong>
                            </a>
                        </li>
                        <li class="links-header">
                            <a>
                                <strong>Actividades Físicas y Deportivas</strong>
                            </a>
                        </li>
                    </ul>
                </div>
                <div class="header2">
                    <h5> CENTRO FP SUPERIOR DE LA CÁMARA DE COMERCIO DE SEVILLA</h5>

                </div>
                <div class="header3">
                    <h2>
                        <xsl:value-of select="//Titulos/Titulo[$codigoTitulo]/@Nombre"></xsl:value-of>
                    </h2> <!--XPATH-->
                </div>
                <div class="header4">
                    <h2>
                        <xsl:value-of select="//Titulos/Titulo[$codigoTitulo]/Modulos/Modulo[@Codigo=concat($codigoModulo,'')]/@Nombre"></xsl:value-of>
                    </h2> <!--XPATH-->
                </div>
                <ul>
                    <div class="contenedor-curso ">
                        <div class="curso" style="font-weight:bold;">
                            <p>Competencias</p>
                        </div>
                        <div class="objetivosgenerales">
                            <div class="accordion rounded-5" id="competenciageneral"
                                 style="background-color: #0195db; max-width: 550px;">
                                <div class="accordion-item rounded-5 mb-2">
                                    <h2 class="accordion-header" id="headingOne">
                                        <button class="accordion-button rounded-5  "
                                                type="button" data-bs-toggle="collapse"
                                                data-bs-target="#collapseOne"
                                                style="background-color:#0195db;color:#ffffff ;font-size: 23px;font-weight: bold;align-items: center;justify-content: center;">
                                            Contenidos Básicos
                                        </button>
                                    </h2>
                                    <div id="collapseOne"
                                         class="accordion-collapse collapse "
                                         data-bs-parent="#accordionExample">
                                        <div class="accordion-body" style="font-size:13px;">
                                            Recopilación de información sobre iniciativas emprendedoras y oportunidades de creación de empresas:
                                            <br></br>
                                            – Plan de empresa: la idea de negocio.
                                            <br></br>
                                            – Factores claves de los emprendedores: iniciativa, creatividad y formación.
                                            <br></br>
                                            – Funciones básicas de la empresa.
                                            <br></br>
                                            – La empresa como sistema.
                                            <br></br>
                                            – Análisis del entorno general y específico de una pyme.
                                            <br></br>
                                            – Relaciones de la pyme con su entorno.
                                            <br></br>
                                            – Relaciones de la pyme con el conjunto de la sociedad.
                                            <br></br>
                                            Establecimiento de la forma jurídica de una empresa:
                                            <br></br>
                                            – La empresa individual. Responsabilidad jurídica y obligaciones formales.
                                            <br></br>
                                            – Sociedades civiles y comunidades de bienes.
                                            <br></br>
                                            – La sociedad mercantil. Tipos de sociedades.
                                            <br></br>
                                            – Sociedad anónima, sociedad limitada y otras.
                                            <br></br>
                                            – Sociedades laborales: anónima y limitada.
                                            <br></br>
                                            – Cooperativas de trabajo asociado y cooperativas de transporte.
                                            <br></br>
                                            – Organismos e instituciones con competencias en el ámbito del transporte.
                                            <br></br>
                                            – Constitución y puesta en marcha de la empresa: requisitos, obligaciones formales y trámites que se deben realizar.
                                            <br></br>
                                            – Subvenciones oficiales y ayudas para la constitución y puesta en marcha de una empresa.
                                            <br></br>
                                            – Obligaciones fiscales y laborales de la empresa.
                                            <br></br>
                                            Organización de los trámites para la obtención de recursos financieros:
                                            <br></br>
                                            – Inversión y financiación: estructura económica y estructura financiera de la empresa.
                                            <br></br>
                                            – Necesidades de inversión en la empresa.
                                            <br></br>
                                            – Fuentes de financiación propia y ajena. Financiación interna y externa.
                                            <br></br>
                                            – Subvenciones oficiales y ayudas financieras a la actividad de la empresa.
                                            <br></br>
                                            – Financiación a largo plazo. Productos financieros: préstamos y empréstitos, leasing y renting. Otras formas de financiación.
                                            <br></br>
                                            – Financiación a corto plazo: créditos comerciales y aplazamientos de pago, créditos bancarios, negociación de efectos comerciales y factoring.
                                            <br></br>
                                            – Manejo de la hoja de cálculo y otras aplicaciones informáticas para el cálculo de los costes financieros y la amortización de préstamos y otros productos financieros.
                                            <br></br>
                                            Formalidades para la compra y/o alquiler de vehículos y otros activos:
                                            <br></br>
                                            – Determinación de las necesidades de equipamiento e inversión.
                                            <br></br>
                                            – Gestión de compras y alquiler de vehículos y suministros.
                                            <br></br>
                                            – Análisis y selección de inversiones. Decisión de compra o alquiler de vehículos y otros inmovilizados.
                                            <br></br>
                                            – Búsqueda de proveedores y suministradores. Solicitud de ofertas y presupuestos.
                                            <br></br>
                                            – Presupuestos y condiciones de compra y de alquiler: cantidad, calidad, precio, descuentos, plazos de entrega, impuestos, condiciones de pago y financiación.
                                            <br></br>
                                            – Elaboración de documentos relativos a la compra y alquiler de vehículos y otros equipamientos, utilizando las herramientas informáticas adecuadas. Elaboración de contratos y formulación de pedidos.
                                            <br></br>
                                            – Creación y mantenimiento de bases de datos de proveedores y suministradores: fichero maestro de proveedores, altas y bajas, introducción y actualización de datos.
                                            <br></br>
                                            – Utilización de una aplicación informática de gestión de compras.
                                            <br></br>
                                            Elaboración de facturas, recibos y documentos de cobro y pago:
                                            <br></br>
                                            – Elaboración de presupuestos.
                                            <br></br>
                                            – Facturación de servicios y devengo de facturas: características y requisitos legales, modelos y tipos de facturas, cumplimentación y expedición de facturas.
                                            <br></br>
                                            – Conservación y registro de facturas de acuerdo con la normativa mercantil y fiscal.
                                            <br></br>
                                            – Fiscalidad de las operaciones de la empresa. Impuesto sobre el valor añadido (IVA) y otros tributos.
                                            <br></br>
                                            – Operaciones intracomunitarias: características y facturación de los productos y/o servicios.
                                            <br></br>
                                            – Medios y documentos de pago y cobro: cheque, transferencia bancaria, recibo normalizado, letra de cambio, tarjeta de crédito y pagaré, entre otros.
                                            <br></br>
                                            – Creación y mantenimiento de bases de datos de clientes.
                                            <br></br>
                                            – Manejo de una aplicación informática de facturación.
                                            <br></br>
                                            Gestión del proceso contable y fiscal en las empresas:
                                            <br></br>
                                            – Obligaciones contables de la empresa. Normativa mercantil y fiscal.
                                            <br></br>
                                            – El patrimonio de la empresa: activo, pasivo y patrimonio neto.
                                            <br></br>
                                            – Las cuentas. Terminología, estructura y tipos.
                                            <br></br>
                                            – Los libros contables y de registro.
                                            <br></br>
                                            – El Plan General Contable para las pymes.
                                            <br></br>
                                            – El ciclo contable. Anotaciones contables, amortizaciones y ajustes, cálculo del resultado y cierre del ejercicio.
                                            <br></br>
                                            – Las cuentas anuales.
                                            <br></br>
                                            – El resultado del ejercicio.
                                            <br></br>
                                            – El Impuesto sobre la Renta de las Personas Físicas (IRPF).
                                            <br></br>
                                            – El Impuesto de Sociedades.
                                            <br></br>
                                            – El Impuesto sobre el Valor Añadido.
                                            <br></br>
                                            – El Impuesto de Circulación de Vehículos.
                                            <br></br>
                                            – Los impuestos sobre determinados vehículos, peajes, tasas y cánones por la utilización de determinadas infraestructuras.
                                            <br></br>
                                            – Manejo de una aplicación informática de contabilidad financiera para el registro contable y para la elaboración de las cuentas anuales.
                                            <br></br>
                                            Determinación de la rentabilidad de las inversiones:
                                            <br></br>
                                            – Interpretación y análisis de la información contable y económico-financiera de la empresa, aplicable a la gestión empresarial.
                                            <br></br>
                                            – El punto muerto o umbral de rentabilidad.
                                            <br></br>
                                            – Evaluación de inversiones y cálculo de la rentabilidad.
                                            <br></br>
                                            – Período medio de maduración.
                                            <br></br>
                                            – Análisis e interpretación de los resultados.
                                            <br></br>
                                            – Análisis de estados financieros de la empresa.
                                            <br></br>
                                            – Principales ratios financieros.
                                            <br></br>
                                            – Análisis económico. Ratios de rentabilidad y eficiencia.
                                            <br></br>
                                            – Utilización de la hoja de cálculo y otras aplicaciones informáticas para el cálculo de ratios y para el análisis económico-financiero de la empresa.
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="competenciaspps">
                            <div class="accordion rounded-5" id="competenciaspps"
                                 style="background-color: #0195db; max-width: 550px; margin-top: 10%;">
                                <div class="accordion-item rounded-5 mb-2">
                                    <h2 class="accordion-header" id="headingTwo">
                                        <button class="accordion-button rounded-5"
                                                type="button" data-bs-toggle="collapse"
                                                data-bs-target="#collapseTwo"
                                                style="background-color:#0195db;color:#ffffff ;font-size: 23px;font-weight: bold;align-items: center;justify-content: center;">
                                            Objetivos Generales
                                        </button>
                                    </h2>
                                    <div id="collapseTwo"
                                         class="accordion-collapse collapse"
                                         data-bs-parent="#accordionExample">
                                        <div class="accordion-body">
                                             
                                            <p style="font-size:13px;">
                                                La formación del módulo contribuye a alcanzar los objetivos generales a), ñ), o), p), q), r), t), v) y w) del ciclo formativo, y las competencias a), m), n), ñ), o), r) y s) del título.
                                            </p>
                                           
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </ul>
                <div class="contenedor-ResultadosAprendizaje">
                    <div class="resultado">
                        <p>Resultados</p>
                    </div>
                    <ul style="margin-left: 12%;">
                        <xsl:for-each select="//Titulos/Titulo[$codigoTitulo]/Modulos/Modulo[@Codigo=concat($codigoModulo,'')]/ResultadoDeAprendizaje">
                            <xsl:variable name="idAc" select="position()" />
                            <xsl:variable name="idResultado" select="@Codigo"/>
                            <br></br>
                            <div class="ra">
                                <div class="accordion rounded-5" id="accordion2{$idAc}"
                                     style="background-color: #0195db; max-width: 550px;">
                                    <div class="accordion-item rounded-5 mb-2">
                                        <h2 class="accordion-header" id="heading{$idAc}">
                                            <button class="accordion-button rounded-5  "
                                                    type="button" data-bs-toggle="collapse"
                                                    data-bs-target="#collapse{$idAc}"
                                                    style="background-color:#0195db;color:#ffffff ;font-size: 23px;font-weight: bold;align-items: center;justify-content: center;">
                                                  
                                                <xsl:value-of select="@Codigo"></xsl:value-of> - <xsl:value-of select="@Descripcion"></xsl:value-of>
                                                
                                            </button>
                                        </h2>
                                        <div id="collapse{$idAc}"
                                             class="accordion-collapse collapse"
                                             data-bs-parent="#accordion2{$idAc}">
                                            <div class="accordion-body">
                                                <xsl:for-each select="//Titulos/Titulo[$codigoTitulo]/Modulos/Modulo[@Codigo=concat($codigoModulo,'')]/ResultadoDeAprendizaje[@Codigo=concat($idResultado,'')]/CriterioDeEvaluacion">
                                                    <li style="list-style:none;text-decoration:none;font-size:13px;">
                                                        <b>Codigo: </b> 
                                                        <xsl:value-of select="@Codigo"></xsl:value-of> 
                                                        <br></br>
                                                        <b>Descripcion: </b> 
                                                        <xsl:value-of select="@Descripcion"></xsl:value-of>
                                                    </li>
                                                </xsl:for-each>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <br></br>
                        </xsl:for-each>
                    </ul>
                </div>
                <div class="footer">
                    <div class="logoFooter">
                        <img src="../img/logoCampusCamara.png"
                             alt="logo Centro FP SUPERIOR" width="218px"
                             height="78px"
                             class="imagen"/>
                    </div>
                    <div class="redes">
                        <img src="../img/icons8-instagram-50.png"
                             alt="Instagram"/>
                        <img src="../img/icons8-youtube-50.png" alt="Youtube"/>
                        <img src="../img/logo-de-facebook.png" alt="Facebook"
                             width="50px" height="50px"/>
                    </div>
                    <div class="contacto">
                        <ul
                            style="align-content: center;list-style-type: none;">
                            <li>
                                <img src="../img/correo-electronico.png"
                                     alt="Correo Electrónico"/>
                                <p
                                    style="color:white;font-size:20px">info@fpcampuscamara.es</p>
                            </li>
                            <li>
                                <img src="../img/llamada.png" alt="Teléfono"/>
                                <p style="color:white;font-size:20px">954238797</p>
                            </li>
                        </ul>
                    </div>
                </div>
            </body>

        </html>
    </xsl:template>

</xsl:stylesheet>
