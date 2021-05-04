<?hh // strict
/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

/**
 * Original thrift exception:-
 * Fiery
 */
class Fiery extends \TException implements \IThriftStruct {
  use \ThriftSerializationTrait;

  const dict<int, this::TFieldSpec> SPEC = dict[
    1 => shape(
      'var' => 'message',
      'type' => \TType::STRING,
    ),
  ];
  const dict<string, int> FIELDMAP = dict[
    'message' => 1,
  ];

  const type TConstructorShape = shape(
    ?'message' => ?string,
  );

  const int STRUCTURAL_ID = 1438368398389181198;
  /**
   * Original thrift field:-
   * 1: string message
   */
  public string $message;

  public function __construct(?string $message = null  )[] {
    parent::__construct();
    $this->message = $message ?? '';
  }

  public static function withDefaultValues()[]: this {
    return new static();
  }

  public static function fromShape(self::TConstructorShape $shape)[]: this {
    return new static(
      Shapes::idx($shape, 'message'),
    );
  }

  public function getName()[]: string {
    return 'Fiery';
  }

  public static function getAllStructuredAnnotations()[]: \TStructAnnotations {
    return shape(
      'struct' => dict[],
      'fields' => dict[
      ],
    );
  }

}

/**
 * Original thrift exception:-
 * Serious
 */
class Serious extends \TException implements \IThriftStruct {
  use \ThriftSerializationTrait;

  const dict<int, this::TFieldSpec> SPEC = dict[
    1 => shape(
      'var' => 'sonnet',
      'type' => \TType::STRING,
    ),
  ];
  const dict<string, int> FIELDMAP = dict[
    'sonnet' => 1,
  ];

  const type TConstructorShape = shape(
    ?'sonnet' => ?string,
  );

  const int STRUCTURAL_ID = 7572301088987666687;
  /**
   * Original thrift field:-
   * 1: string sonnet
   */
  public ?string $sonnet;

  public function __construct(?string $sonnet = null  )[] {
    parent::__construct();
    $this->sonnet = $sonnet;
  }

  public static function withDefaultValues()[]: this {
    return new static();
  }

  public static function fromShape(self::TConstructorShape $shape)[]: this {
    return new static(
      Shapes::idx($shape, 'sonnet'),
    );
  }

  public function getName()[]: string {
    return 'Serious';
  }

  <<__Override>>
  public function getMessage()[]: string {
    return $this->sonnet ?? '';
  }

  public static function getAllStructuredAnnotations()[]: \TStructAnnotations {
    return shape(
      'struct' => dict[],
      'fields' => dict[
      ],
    );
  }

}

/**
 * Original thrift exception:-
 * ComplexFieldNames
 */
class ComplexFieldNames extends \TException implements \IThriftStruct {
  use \ThriftSerializationTrait;

  const dict<int, this::TFieldSpec> SPEC = dict[
    1 => shape(
      'var' => 'error_message',
      'type' => \TType::STRING,
    ),
    2 => shape(
      'var' => 'internal_error_message',
      'type' => \TType::STRING,
    ),
  ];
  const dict<string, int> FIELDMAP = dict[
    'error_message' => 1,
    'internal_error_message' => 2,
  ];

  const type TConstructorShape = shape(
    ?'error_message' => ?string,
    ?'internal_error_message' => ?string,
  );

  const int STRUCTURAL_ID = 4419960994551853385;
  /**
   * Original thrift field:-
   * 1: string error_message
   */
  public string $error_message;
  /**
   * Original thrift field:-
   * 2: string internal_error_message
   */
  public string $internal_error_message;

  public function __construct(?string $error_message = null, ?string $internal_error_message = null  )[] {
    parent::__construct();
    $this->error_message = $error_message ?? '';
    $this->internal_error_message = $internal_error_message ?? '';
  }

  public static function withDefaultValues()[]: this {
    return new static();
  }

  public static function fromShape(self::TConstructorShape $shape)[]: this {
    return new static(
      Shapes::idx($shape, 'error_message'),
      Shapes::idx($shape, 'internal_error_message'),
    );
  }

  public function getName()[]: string {
    return 'ComplexFieldNames';
  }

  <<__Override>>
  public function getMessage()[]: string {
    return $this->internal_error_message ?? '';
  }

  public static function getAllStructuredAnnotations()[]: \TStructAnnotations {
    return shape(
      'struct' => dict[],
      'fields' => dict[
      ],
    );
  }

}

/**
 * Original thrift exception:-
 * CustomFieldNames
 */
class CustomFieldNames extends \TException implements \IThriftStruct {
  use \ThriftSerializationTrait;

  const dict<int, this::TFieldSpec> SPEC = dict[
    1 => shape(
      'var' => 'error_message',
      'type' => \TType::STRING,
    ),
    2 => shape(
      'var' => 'internal_error_message',
      'type' => \TType::STRING,
    ),
  ];
  const dict<string, int> FIELDMAP = dict[
    'error_message' => 1,
    'internal_error_message' => 2,
  ];

  const type TConstructorShape = shape(
    ?'error_message' => ?string,
    ?'internal_error_message' => ?string,
  );

  const int STRUCTURAL_ID = 4419960994551853385;
  /**
   * Original thrift field:-
   * 1: string error_message
   */
  public string $error_message;
  /**
   * Original thrift field:-
   * 2: string internal_error_message
   */
  public string $internal_error_message;

  public function __construct(?string $error_message = null, ?string $internal_error_message = null  )[] {
    parent::__construct();
    $this->error_message = $error_message ?? '';
    $this->internal_error_message = $internal_error_message ?? '';
  }

  public static function withDefaultValues()[]: this {
    return new static();
  }

  public static function fromShape(self::TConstructorShape $shape)[]: this {
    return new static(
      Shapes::idx($shape, 'error_message'),
      Shapes::idx($shape, 'internal_error_message'),
    );
  }

  public function getName()[]: string {
    return 'CustomFieldNames';
  }

  <<__Override>>
  public function getMessage()[]: string {
    return $this->internal_error_message ?? '';
  }

  public static function getAllStructuredAnnotations()[]: \TStructAnnotations {
    return shape(
      'struct' => dict[],
      'fields' => dict[
      ],
    );
  }

}

/**
 * Original thrift exception:-
 * Banal
 */
class Banal extends \TException implements \IThriftStruct {
  use \ThriftSerializationTrait;

  const dict<int, this::TFieldSpec> SPEC = dict[
  ];
  const dict<string, int> FIELDMAP = dict[
  ];

  const type TConstructorShape = shape(
  );

  const int STRUCTURAL_ID = 957977401221134810;

  public function __construct(  )[] {
    parent::__construct();
  }

  public static function withDefaultValues()[]: this {
    return new static();
  }

  public static function fromShape(self::TConstructorShape $shape)[]: this {
    return new static(
    );
  }

  public function getName()[]: string {
    return 'Banal';
  }

  public static function getAllStructuredAnnotations()[]: \TStructAnnotations {
    return shape(
      'struct' => dict[],
      'fields' => dict[
      ],
    );
  }

}

