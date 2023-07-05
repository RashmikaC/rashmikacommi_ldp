import * as React from "react";
import { styled } from "@mui/material/styles";
import Radio, { RadioProps } from "@mui/material/Radio";
import theme from "../../../theme/theme";

const Icon = styled("span")({
  borderRadius: "50%",
  width: 16,
  height: 16,
  boxShadow: "0 0 0 1px rgb(16 22 26 / 40%)",
});

const CheckedIcon = styled(Icon)({
  backgroundColor: theme.palette.primary.primary500,
  "&:before": {
    display: "block",
    width: 16,
    height: 16,
    backgroundImage: "radial-gradient(#fff,#fff 28%,transparent 32%)",
    content: '""',
  },
});

const RadioButton = (props: RadioProps) => {
  return (
    <Radio
      disableRipple
      color="default"
      checkedIcon={<CheckedIcon />}
      icon={<Icon />}
      {...props}
    />
  );
};

export default RadioButton;
