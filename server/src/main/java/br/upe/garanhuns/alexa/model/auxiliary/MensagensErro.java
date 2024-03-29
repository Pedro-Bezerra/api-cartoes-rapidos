package br.upe.garanhuns.alexa.model.auxiliary;

public class MensagensErro {

  public static final String MSG_ERRO_INESPERADO =
      "Ocorreu um erro no processamento de seus dados. Tente novamente!";
  public static final String MSG_ELEMENTO_AUSENTE = "O elemento informado é nulo";
  public static final String MSG_ERRO_AUTENTICACAO =
      "Houve uma falha na autenticação do usuário. Tente novamente!";
  public static final String MSG_USUARIO_EXISTENTE =
      "Já existe um usuário cadastrado com o e-mail informado";
  public static final String MSG_NAO_ENCONTRADO = "O elemento solicitado não foi encontrado";
  public static final String MSG_ERRO_OPTIONAL = "Não há algum valor dentro do Optional<?>";
  public static final String MSG_ERRO_ALGORITMO = "O algoritmo informado é inválido";
  public static final String MSG_ERRO_JWT = "Erro no processamento do JWT";
  public static final String MSG_ERRO_ASSINATURA = "A assinatura informada é inválida";
  public static final String MSG_TOKEN_EXPIRADO = "O token informado já expirou";
  public static final String MSG_CLAIM_AUSENTE = "Claim a ser verificado não foi informado";
  public static final String MSG_ERRO_CLAIM = "O claim informado é inválido";
  public static final String MSG_ERRO_DATA = "Erro referete aos dados do período de autenticação";
  public static final String MSG_ERRO_REMOCAO =
      "Não foi possível realizar a remoção, pois não há nenhum elemento com o ID informado.";
}
